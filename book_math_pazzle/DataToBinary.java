import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.text.*;

public class DataToBinary {
  public static void main(String[] args) {
    LocalDateTime date = LocalDateTime.of(1964, 10, 10, 0 ,0);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
    LocalDateTime lastDay = LocalDateTime.of(2020, 7, 24, 0, 0);

    while(!(date.isEqual(lastDay))){
      String d = date.format(dtf);
      String dateBinary = Integer.toBinaryString(Integer.parseInt(d));
      StringBuilder reversedDateBinary = new StringBuilder(dateBinary).reverse();
      int dateDecimal = Integer.parseInt(reversedDateBinary.toString(), 2);
      String resultDate = String.valueOf(dateDecimal);
      if(resultDate.equals(d)){
        System.out.println(d);
      }
      date = date.plusDays(1);
    }
  }
}
