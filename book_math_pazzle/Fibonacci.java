import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.*;

public class Fibonacci {
  public static void main(String[] args) {
    
    long x = 0;
    long a = 1L;
    long b = 1L;
    for (int i = 0; i < 50; i++) {
        x = a + b;
        
        System.out.println(x); 
        if(x < 0){
          break;
        }
        b = a;
        a = x;
        x = 0;

    }
  }
}
