package pdd;

import java.util.*;

/**
 * @author ruanxin
 * @create 2018-04-03
 * @desc
 */
public class sanjiao {
    public static class Point {
        public int x;
        public int y;
        public Point (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineNumStr = scanner.nextLine();
        int lineNum = Integer.parseInt(lineNumStr);
        Point[] points = new Point[lineNum];
        for (int i = 0; i < lineNum;i++) {
            String p = scanner.nextLine();
            String[] po = p.split(" ");
            Point point = new Point(Integer.parseInt(po[0]), Integer.parseInt(po[1]));
            points[i] = point;
        }
        Map<String, Double> cacheMap = new HashMap<String, Double>();
        int conut = 0;
        for (int i = 0; i < lineNum;i++) {
            for (int j = i + 1; j < lineNum;j++) {
                double dis = distance(points[i], points[j]);
                cacheMap.put(i + "_" + j, dis);
            }
        }

        for (int i = 0; i < lineNum;i++) {
            for (int j = i + 1;j < lineNum;j++) {
                for (int k = j + 1;k < lineNum;k++) {
                    double dis_1 = cacheMap.get(i + "_" + j);
                    double dis_2 = cacheMap.get(j + "_" + k);
                    double dis_3 = cacheMap.get(i + "_" + k);
                    if (canMakeTriangle(dis_1, dis_2, dis_3)) {
                        conut++;
                    }
                }
            }
        }
        System.out.println(conut);
    }
    public static double distance (Point point_1, Point point_2) {
        return Math.sqrt((point_1.x - point_2.x)*(point_1.x - point_2.x) +
                (point_1.y - point_2.y)*(point_1.y - point_2.y));
    }
    public static boolean canMakeTriangle(double a, double b, double c) {
        return  a > Math.abs(b - c) && a < (b + c) ||
                b > Math.abs(a - c) && b <(a + c) ||
                c > Math.abs(a - b) && c <(a + b);
    }
}
