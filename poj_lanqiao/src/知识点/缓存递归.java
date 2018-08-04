package 知识点;

import java.util.*;

public class 缓存递归 {
    // 如何避免大量的重复计算
    // 通用法：缓存  用map (键值对，字典)

    static int i=0;
    static long g(Map map, int n){
        Long t = (Long)map.get(n);
        if(t != null){
            return t;
        }
        long r = g(map, n-1) + g(map, n-2);
        map.put(n, r);
        return r;
    }

    // 斐波那契数列的第n项目
    static long f(int n){
        if(n==1 || n==2) return 1;
        return f(n-1) + f(n-2);
    }

    public static void main(String[] args){
        Map map = new HashMap();
        map.put(1,1L);
        map.put(2,1L);

//        System.out.println(g(map, 10));
        System.out.println(f(10));
    }
}