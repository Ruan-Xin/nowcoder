package xiecheng;

import java.util.Scanner;

/**
 * @author ruanxin
 * @create 2018-03-29
 * @desc
 */
public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] firstLineArr = firstLine.split("\\ ");
        int n = firstLineArr.length;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < firstLineArr.length;i++) {
            matrix[0][i] = Integer.parseInt(firstLineArr[i]);
        }

        for (int i = 1; i < n;i++) {
            String nextLine = scanner.nextLine();
            String[] nextLineArr = nextLine.split("\\ ");
            for (int j = 0;j < nextLineArr.length;j++) {
                matrix[i][j] = Integer.parseInt(nextLineArr[j]);
            }
        }

        for (int i = 0; i < n / 2; i++)
        {
            int num = n - 2 * i;
            int move_count = num - 1;
            for (int j = i; j < i + move_count; j++)
            {
                int offset = j - i;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i + num - 1 - offset][i];
                matrix[i + num - 1 - offset][i] = matrix[i+num-1][i+num-1-offset];
                matrix[i + num - 1][i + num - 1 - offset] = matrix[i + offset][i + num - 1];
                matrix[i + offset][i + num - 1]=temp;
            }
        }
        for (int i = 0; i < matrix.length;i++) {
            for (int j = 0; j < matrix.length;j++) {
                if (j + 1 != n) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
            if (i + 1 != n) {
                System.out.println();
            }
        }
    }
}
