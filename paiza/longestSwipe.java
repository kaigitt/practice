import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1, 0, 1, 1},
            {1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 1, 1},
            {0, 1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 0},
            {1, 0, 0, 0, 0, 1},
            {1, 1, 0, 1, 0, 1},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 0, 0, 1, 1},
            {1, 0, 1, 1, 1, 0}
        };

        int[] flattened = new int[matrix.length * matrix[0].length];
        int index = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                flattened[index++] = value;
            }
        }

        Arrays.sort(flattened);

        index = 0;

        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                row[j] = flattened[index++];
            }
        }

        // ソート後の行列を表示
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
