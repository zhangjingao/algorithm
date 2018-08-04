package 算法提高;

import java.util.*;

public class Main_学霸的迷宫 {

    static int [][] move = {{1,0},{-1,0},{0,1},{0,-1}};
    static int num;
    static String step;
    static char [][] arr;
    static Map<String,danyuan> map = new HashMap<>();
    static LinkedList<danyuan> queue = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int n = sca.nextInt();
            int m = sca.nextInt();
            arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                arr[i] = sca.next().toCharArray();
            }
            out(arr);
        }
    }

    private static void out (char [][] arr) {
        danyuan start = new danyuan(new point(0,0),null,0,"");
        map.put(0+""+0 , start);
        queue.add(start);
        int x = start.point.x;
        int y = start.point.y;
        while (true) {
            danyuan place = queue.poll();
            x = place.point.x;
            y = place.point.y;
            if (x == arr.length-1 && y == arr[0].length-1) {
                map.put(x+""+y,place);
                break;
            }
            if (test(x+1,y,num+1)) {
                danyuan D = new danyuan(new point(x+1,y),place.point,num+1,"D");
                map.put(x+1+""+y,D);
                queue.offer(D);
            }
            if (test(x-1,y,num+1)) {
                danyuan U = new danyuan(new point(x-1,y),place.point,num+1,"U");
                map.put(x-1+""+y,U);
                queue.offer(U);
            }
            if (test(x,y+1,num+1)) {
                danyuan L = new danyuan(new point(x,y+1),place.point,num+1,"L");
                map.put(x+""+y+1,L);
                queue.offer(L);
            }
            if (test(x,y-1,num+1)) {
                danyuan R = new danyuan(new point(x,y-1),place.point,num+1,"R");
                map.put(x+""+(y-1),R);
                queue.offer(R);
            }
        }
        danyuan end = map.get(arr.length-1+""+(arr[0].length-1));
        int xx = end.point.x;
        int yx = end.point.y;
        String str = end.step;
        while (true) {
            danyuan come = map.get(xx+""+yx);
            xx = come.come.x;
            yx = come.come.y;
            str = come.step+str;
            if (xx == 0 && yx == 0) {
                break;
            }
        }
        System.out.println(end.num+"\n"+str);
    }

    private static boolean test (int x,int y,int num) {
        boolean boo = false;
        if (x >= 0 && x < arr.length && y >= 0 && y <arr[0].length && arr[x][y] == '0') {
            danyuan danyuan = map.get(x+""+y);
            if (danyuan == null) {
                boo = true;
            } else {
                boo = danyuan.num > num? true: false;
            }
        }
        System.out.println(x+" "+y+" "+ boo);
        return boo;
    }

}


class point {

    int x,y;

    point(int x,int y) {
        this.x = x;
        this.y = y;
    }

}

class danyuan {

    point point;
    point come;
    int num;//到达这个点走的步数
    String step;

    danyuan (point point,point come,int num,String step) {
        this.point = point;
        this.come = come;
        this.num = num;
        this.step = step;
    }

    @Override
    public String toString() {
        return point.x+" "+point.y+" "+come.x+" "+come.y+" "+num+" "+step;
    }
}