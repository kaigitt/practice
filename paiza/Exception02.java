package exception;

public class Exception02 {
  public static void main(String args) {
    try {
      System.out.println("100 + 0は？");
      int result = 100 / 0;
    } catch (ArithmeticException e) {
      System.out.println("例外が発生");
    } finally {
      System.out.println("プログラム終了");
    }
  }
}