import java.util.*;
public class Main {
    public static void main(String[] args) {
        //���j
        // 
        Scanner sc = new Scanner(System.in);
        String s = sc.next().replaceAll("a", "").replaceAll("i", "").replaceAll("u", "").replaceAll("o", "").replaceAll("e", "");
        System.out.println(s);
    }
}