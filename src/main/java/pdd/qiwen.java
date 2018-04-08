package pdd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author ruanxin
 * @create 2018-04-03
 * @desc
 */
public class qiwen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] nk = firstLine.split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        int[] cyLow = new int[n];
        int[] cyHigh = new int[n];
        for (int i = 0; i < n;i++) {
            String line = scanner.nextLine();
            String[] arg = line.split(" ");
            cyLow[i] = Integer.parseInt(arg[0]);
            cyHigh[i] = Integer.parseInt(arg[1]);
        }
        int high = -51;
        int low = 51;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n;i++) {
            for (int j = cyLow[i];j <= cyHigh[i];j++) {
                if (map.get(j) == null) {
                    map.put(j,1);
                } else {
                    int num = map.get(j);
                    map.put(j,++num);
                }
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) >= k) {
                if (key < low) {
                    low = key;
                }
                if (key > high) {
                    high = key;
                }
            }
        }
        if (low == 51 || high == -51) {
            System.out.println("error");
        } else {
            System.out.println(low + " " + high);
        }
    }
}
