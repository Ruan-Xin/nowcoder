package pdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ruanxin
 * @create 2018-04-03
 * @desc
 */
public class huadongWindow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] arg = firstLine.split(" ");
        int arrLength = Integer.parseInt(arg[0]);
        int windowLength = Integer.parseInt(arg[1]);

        String arrLine = scanner.nextLine();
        String[] arr = arrLine.split(" ");
        int[] windowsArr = new int[windowLength];
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < windowLength;i++) {
            windowsArr[i] = Integer.parseInt(arr[i]);
        }
        int lastMax = max(windowsArr);
        int lastMin = min(windowsArr);
        res.add(lastMax - lastMin);
        for (int i = windowLength;i < arrLength;i++) {
            int newOne = Integer.parseInt(arr[i]);
            int sheqi = Integer.parseInt(arr[i - windowLength]);
            if (sheqi == lastMax) {
//                for (int j = i - windowLength + 1; j < )
            }
        }
    }
    public static int min(int[] arr) {
        int min = 99999;
        for (int i = 0; i < arr.length;i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int max(int[] arr) {
        int max = -99999;
        for (int i = 0; i < arr.length;i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
