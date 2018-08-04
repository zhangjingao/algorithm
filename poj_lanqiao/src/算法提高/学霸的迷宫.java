package 算法提高;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class 学霸的迷宫 {
    public static String str ;
    public static char[][] arr;
    private static int n;
    private static int m;
    private static HashMap<String, Danyuan> map;
    private static LinkedList<Danyuan> queue;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            arr = new char [n][m];
            str = "";
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next().toCharArray();
            }
            map = new HashMap<>();
            queue = new LinkedList<>();
            Danyuan star = new Danyuan(new Point(0,0), null,0,"");
            map.put(0+" "+0, star);
            queue.add(star);
            while (true) {
                Danyuan v = queue.poll();
                int x = v.my.x;
                int y = v.my.y;
                if (x == n-1 && y == m-1) {
                    map.put(x+" "+y, v);
                    break;
                }
                if (test(x+1,y,v.num+1)) {
                    Danyuan danyuan = new Danyuan(new Point(x+1, y), v.my , v.num + 1, "D");
                    queue.add(danyuan);
                    map.put((x+1)+" "+y, danyuan);
                }
                if (test(x,y-1,v.num+1)) {
                    Danyuan danyuan = new Danyuan(new Point(x, y-1), v.my , v.num + 1, "L");
                    queue.add(danyuan);
                    map.put(x+" "+(y-1), danyuan);
                }
                if (test(x,y+1,v.num+1)) {
                    Danyuan danyuan = new Danyuan(new Point(x, y+1), v.my , v.num + 1, "R");
                    queue.add(danyuan);
                    map.put(x+" "+(y+1), danyuan);
                }
                if (test(x-1,y,v.num+1)) {
                    Danyuan danyuan = new Danyuan(new Point(x-1, y), v.my , v.num + 1, "U");
                    queue.add(danyuan);
                    map.put((x-1)+" "+y, danyuan);
                }
            }
            Danyuan end = map.get((n-1)+" "+(m-1));
            int x = end.come.x;
            int y = end.come.y;
            str = end.place + str;
            while (true) {
                Danyuan danyuan = map.get(x+" "+y);
                x = danyuan.come.x;
                y = danyuan.come.y;
                str = danyuan.place + str;
                if (x == 0 && y == 0) {
                    break;
                }
            }
            System.out.println(end.num+"\n"+str);
        }
    }
    private static boolean test(int i, int j,int num) {
        // TODO Auto-generated method stub
        if (i >= 0 && i < n && j >= 0 && j < m && arr[i][j] == '0') {
            Danyuan danyuan = map.get(i+" "+j);
            if (danyuan == null) {
                return true;
            }else {
                return danyuan.num > num ? true : false;
            }
        }
        return false;
    }

}
class Danyuan {
    Point my;
    Point come;
    String place;
    int num;
    public Danyuan(Point my, Point come,int num,String place) {
        // TODO Auto-generated constructor stub
        this.my = my;
        this.come = come;
        this.num = num;
        this.place = place;
    }
}
class Point {
    int x ;
    int y ;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}