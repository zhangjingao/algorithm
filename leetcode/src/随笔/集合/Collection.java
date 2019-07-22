package 随笔.集合;

import java.util.*;

/**
 * @author zjg
 * <p> 2019/3/17 11:07 </p>
 */
public class Collection {

    public static void main(String[] args) {

        //map和set无序
        Vector vector = new Vector();
        Set<String> set = new HashSet<>();
        set.add("90");
        set.add("34");
        set.add("45");
        for (int i = 0; i < 3; i++ ) {
            set.forEach(System.out::println);
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(7,2);
        map.put(3,4);
        map.put(5,6);
        for (int i = 0; i < 3; i++) {
            map.forEach((K,V)->{
                System.out.print(K+" "+V+" || ");
            });
            System.out.println();
        }
        Map<Collection, Integer> maps = new HashMap<>();
        maps.put(new Collection(), 1);
        System.out.println(maps.keySet().iterator().next());


        //位运算
        int a = 1;
        int b = 2;
        a = a ^ b;
        System.out.println(a +" "+ b +" ");
        b = a ^ b;
        System.out.println(a +" "+ b);
        a = a ^ b;
        System.out.println(a +" "+ b);



    }

    public String test (int a) {
        return "s";
    }


}
