import java.util.Scanner;

public class placingMarbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr;
        arr = str.charToArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
          if(arr[i].equals("1")){
            count++:
          }
        }

        System.out.println(count);
    }
}
