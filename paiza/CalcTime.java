import java.util.*;
public class CalcTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        
        int hour = s / 3600;
        int min = (s % 3600) / 60;
        int sec = ((s % 3600) % 60);
        
        
        System.out.println(hour + ":" + min + ":" + sec);
    }
    
}