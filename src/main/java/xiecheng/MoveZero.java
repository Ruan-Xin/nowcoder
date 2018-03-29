package xiecheng;

import java.util.Scanner;

/**
 * @author ruanxin
 * @create 2018-03-29
 * @desc
 */
public class MoveZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        long arr[] = new long[count];
        for (int i = 0; i < count;i++) {
            arr[i] = scanner.nextLong();
        }
        //find the first zero
        int firstZeroIndex = 0;
        boolean isZero = false;
        for (int i = 0; i < count;i++) {
            if (arr[i] == 0) {
                firstZeroIndex = i;
                isZero = true;
                break;
            }
        }
        if (!isZero) {
            for (int i = 0;i < arr.length;i++) {
                System.out.println(arr[i]);
            }
            return;
        }

        for (int i = firstZeroIndex + 1; i < count;i++) {
            if (arr[i] == 0) {
                continue;
            } else {
                arr[firstZeroIndex] = arr[i];
                arr[i] = 0;
                firstZeroIndex++;
            }
        }
        for (int i = 0; i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void test() {

    }
}
