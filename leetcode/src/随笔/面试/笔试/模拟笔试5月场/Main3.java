package 随笔.面试.笔试.模拟笔试5月场;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/5/15 19:28 </p>
 */
public class Main3 {

    static int minPath = Integer.MAX_VALUE;
    static int beforex = 0;
    static int beforey = 0;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        String[][] park = new String[n][n];
        int x = 0, y = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            String str = sca.next();
            for (int j = 0; j < n; j++) {
                park[i][j] = String.valueOf(str.charAt(j));
                if (park[i][j].equals("*")) {
                    x = i;
                    y = j;
                } else if (park[i][j].equals("@")) {
                    m++;
                }
            }
        }
        if (n == 1) {
            System.out.println(0);
            return;
        }
//        for (int i = 0; i < m; i++) {
            work(park, x, y, 0);
//        }
        System.out.println(minPath);
    }

    private static void work(String[][] park, int x, int y, int path) {
//        System.out.println(x+" "+y);
        if (park[x][y].equals("@")) {
            if (path < minPath) {
                minPath = path;
            }
            return;
        }
        park[x][y] = "0";
        if (x > 0 && !park[x - 1][y].equals("0") && !park[x - 1][y].equals("#")) {
            work(park, x - 1, y, path + 1);
        }
        if (y > 0 && !park[x][y - 1].equals("0") && !park[x][y - 1].equals("#")) {
            work(park, x, y - 1, path + 1);
        }
        if (x < park.length - 1 && !park[x + 1][y].equals("0") && !park[x + 1][y].equals("#")) {
            work(park, x + 1, y, path + 1);
        }
        if (y < park.length - 1 && !park[x][y + 1].equals("0") && !park[x][y + 1].equals("#")) {
            work(park, x, y + 1, path + 1);
        }


    }

}
