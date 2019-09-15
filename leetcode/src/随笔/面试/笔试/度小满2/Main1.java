package 随笔.面试.笔试.度小满2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/9/15 18:59
 **/
public class Main1 {


    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int x = sca.nextInt();
        int y = sca.nextInt();
        int n = sca.nextInt();
        int[][] range = new int[1000][1000];
        int[][] MOVES = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int i = 0; i < n; i++) {
            int pointX = sca.nextInt() + 500;
            int pointY = sca.nextInt() + 500;
            //障碍物
            range[pointX][pointY] = 1;
        }
        System.out.println(work(range, x, y, MOVES));
    }

    private static int work(int[][] maze, int x, int y, int[][] MOVES) {
        Queue<Point> queue = new ArrayDeque<>(1000 * 1000);
        Point start = new Point(500, 500, 0);
        Point end = new Point(x + 500, y + 500, 0);
        queue.add(start);
        Point curPos;
        while (!queue.isEmpty()) {
            curPos = queue.remove();

            if (curPos.equals(end)) {
                return curPos.layer;
            }
            maze[curPos.x][curPos.y] = 'o';
            for (int[] step : MOVES) {
                int xx = curPos.x + step[0];
                int yy = curPos.y + step[1];
                if (xx >= 0 && xx < 1000 && yy >= 0 && yy < 1000 && maze[xx][yy] == 0) {
                    int layer = curPos.layer + 1;
                    Point nextPos = new Point(xx, yy, layer);
                    queue.add(nextPos);
                }
            }
        }
        return -1;
    }

    static class Point {
        int x, y,layer;
        Point(int x, int y, int layer) {
            this.x = x;
            this.y = y;
            this.layer = layer;
        }
        @Override
        public boolean equals(Object obj) {
            return ((Point) obj).x == this.x && ((Point) obj).y == this.y;
        }
    }

}
