package 随笔.面试;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.*;

/**
 * @author zjg
 * <p> 2019/2/14 21:54 </p>
 */
public class Main {



    public static void main(String[] args) {
        new ArrayList();
        Map hashmap = new HashMap();
        hashmap.put(null,null);

        hashmap.forEach((K,V)->{
            System.out.println(K+" "+V);
        });

        hashmap = new ConcurrentHashMap();
        hashmap.forEach((K,V)->{
            System.out.println(K+" "+V);
        });

        hashmap = new Hashtable();
        hashmap.forEach((K,V)->{
            System.out.println(K+" "+V);
        });


        int[] arr = {5,3,4,7,2,4,3,4,7};
        try {
            ExecutorService es = Executors.newFixedThreadPool(5);
            Future<Object> f = es.submit(new Test());

            System.out.println("2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

class Test implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("1");
        return null;
    }
}
