package xiecheng;

import java.util.Scanner;

/**
 * @author ruanxin
 * @create 2018-03-29
 * @desc
 */
public class Horse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hsTypeCount = scanner.nextInt();
        String[][] hsInfo = new String[hsTypeCount][3];
        int cc = 0;
        for (int i = 0; i < hsTypeCount;i++) {
            String nextLine = scanner.nextLine();
            String[] nextLineArr = nextLine.split(" ");
            for (int j = 0; j < 3;j++) {
                hsInfo[i][j] = nextLineArr[j];
            }
        }

        String ruzhuInfo = scanner.nextLine();
        String[] ruzhuInfoArr = ruzhuInfo.split(" ");
    }
}
