import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int count = 0;
        for (int num = A; num <= B; num++) {
            if (isRotationValid(num)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 180度回転しても整数として読めるかを判定する関数
    private static boolean isRotationValid(int num) {
        int rotatedNum = rotate180(num);
        return num == rotatedNum;
    }

    // 数字を180度回転する関数
    private static int rotate180(int num) {
        int rotatedNum = 0;
        while (num > 0) {
            int digit = num % 10;
            int rotatedDigit;
            switch (digit) {
                case 0:
                case 1:
                case 8:
                    rotatedDigit = digit;
                    break;
                case 6:
                    rotatedDigit = 9;
                    break;
                case 9:
                    rotatedDigit = 6;
                    break;
                default:
                    return -1; // 回転できない数字が含まれる場合はエラーとして-1を返す
            }
            rotatedNum = rotatedNum * 10 + rotatedDigit;
            num /= 10;
        }
        return rotatedNum;
    }
}
