import java.util.Scanner;

class BubbleSort {

    //--- 配列の要素a[id1]とa[id2]の値を交換 ---//
    static void swap(int[] a, int id1, int id2) {
        int t = a[id1];
        a[id1] = a[id2];
        a[id2] = t;
    }

    //--- 単純交換ソート ---//
    static void bubbleSort(int[] a, int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = n - 1; j > i; j--) {
            if (a[j - 1] < a[j]) {
                swap(a, j - 1, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("単純交換ソート（バブルソート）");
        System.out.print("要素数：");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]：");
            x[i] = sc.nextInt();
        }

        bubbleSort(x, nx);  // 配列xをバブルソート

        System.out.println("昇順にソートしました。");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]＝" + x[i]);
        }
    }
}