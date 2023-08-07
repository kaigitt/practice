import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System system = new System();
        Time globalTime = new Time(1, 0, 0);
        List<Request> reqs = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Request req = parse(line);
            reqs.add(req);
        }

        Request req = reqs.get(0);
        while (system.isRunning() || !reqs.isEmpty()) {
            system.isComplete();
            if (req.getTime().equals(globalTime)) {
                //system.add(req) リクエストをシステムに登録する作業
                system.add(req);
                //登録後にリクエストを削除
                reqs.remove(0);
                if (!reqs.isEmpty()) {
                    req = reqs.get(0);
                }
            }
            system.assign();
            globalTime.step();
        }
    }

    //parseメソッド 入力値を整形する　Request型で返す
    private static Request parse(String line) {
        String[] parts = line.split(" ");
        int day = Integer.parseInt(parts[0]);
        String[] hm = parts[1].split(":");
        int hour = Integer.parseInt(hm[0]);
        int minute = Integer.parseInt(hm[1]);
        String type = parts[2];
        String id = parts[3];
        int duration = Integer.parseInt(parts[4]);
        Time time = new Time(day, hour, minute);
        return new Request(time, type, id, duration);
    }
}

class Request {
    private Time time;
    private String type;
    private String id;
    private int duration;
    private Time compTime;

    public Request(Time time, String type, String id, int duration) {
        this.time = time;
        this.type = type;
        this.id = id;
        this.duration = duration;
    }

    public Time getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public int getDuration() {
        return duration;
    }

    public Time getCompTime() {
        return compTime;
    }

    public void setCompTime(Time compTime) {
        this.compTime = compTime;
    }

    public boolean isValid() {
        return true;
    }

    @Override
    public String toString() {
        return id;
    }
}

class Postman {
    private Request item;

    public void assign(Request req) {
        this.item = req;
    }

    public Request getItem() {
        return item;
    }
}

class Queue {
    private List<Request> list = new ArrayList<>();

    public Request search() {
        for (int i = 0; i < list.size(); i++) {
            Request req = list.get(i);
            if (req.isValid()) {
                list.remove(i);
                return req;
            }
        }
        return null;
    }

    public void add(Request req) {
        list.add(req);
    }
}

class System {
    //フィールド　メンバ変数　インスタンス化
    private boolean running = true;
    private Postman postman = new Postman();
    private Queue expQueue = new Queue();
    private Queue normalQueue = new Queue();

    public boolean isRunning() {
        return running;
    }

    public void add(Request req) {
        if (check(req)) {
            System.out.println(req.getTime() + " " + req.getId() + " has been accepted.");
            running = true;
            //配送タイプによる分岐
            if ("EXPRESS".equals(req.getType())) {
                expQueue.add(req);
            } else if ("NORMAL".equals(req.getType())) {
                normalQueue.add(req);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            System.out.println(req.getTime() + " ERROR: Delivery time cannot exceed 120 minutes.");
        }
    }

    public void isComplete() {
        if (postman.getItem() == null) {
            return;
        }

        if (postman.getItem().getCompTime().equals(globalTime)) {
            System.out.println(globalTime + " " + postman.getItem().getId() + " has been delivered.");
            postman.assign(null);

            if (expQueue.list.isEmpty() && normalQueue.list.isEmpty()) {
                running = false;
            }
        }
    }

    public void assign() {
        if (postman.getItem() != null) {
            return;
        }

        //expQueueもしくはnormalQueueから探す
        Request req = expQueue.search();
        if (req == null) {
            req = normalQueue.search();
        }

        if (req != null) {
            System.out.println(globalTime + " " + req.getId() + " has been assigned.");
            req.setCompTime(globalTime.add(req.getDuration()));
            postman.assign(req);
        }
    }

    public boolean check(Request req) {
        return req.getDuration() <= 120;
    }
}

class Time {
    private int day;
    private int hour;
    private int minute;

    public Time(int day, int hour, int minute) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public void step() {
        minute++;
        if (minute == 60) {
            minute = 0;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
            day++;
        }
    }

    public int minutes() {
        return day * 24 * 60 + hour * 60 + minute;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Time other = (Time) obj;
        return day == other.day && hour == other.hour && minute == other.minute;
    }

    @Override
    public int hashCode() {
        return day * 31 * 31 + hour * 31 + minute;
    }

    @Override
    public String toString() {
        return day + " " + String.format("%02d", hour) + ":" + String.format("%02d", minute);
    }

    public Time add(int minutes) {
        Time time = new Time(day, hour, minute);
        for (int i = 0; i < minutes; i++) {
            time.step();
        }
        return time;
    }
}
