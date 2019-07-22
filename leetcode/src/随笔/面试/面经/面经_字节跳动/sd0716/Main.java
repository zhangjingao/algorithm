package 随笔.面试.面经.面经_字节跳动.sd0716;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;

/**
 * @author zjg
 * <p> 2019/7/16 20:34 </p>
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = {13, 12, 11, 10, 9,8,7,6,5,4,3,2,1};
        ArrayDeque<Integer> deque = new ArrayDeque();
        deque.addFirst(arr[0]);
        int index = 1;
        work(deque, arr, index);

        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }
    }

    private static void work(ArrayDeque<Integer> deque, int[] arr, int index) {
        if (index > 12) {
            return;
        }
        //每次往首部添加，添加一次将尾部提到前面
        deque.addFirst(arr[index]);
        index++;
        int temp = deque.pollLast();
        deque.addFirst(temp);
        work(deque, arr, index);
    }

}
//queue.add(13);
//        queue.add(12);
//        queue.add(11);
//        queue.add(10);
//        queue.add(9);
//        queue.add(8);
//        queue.add(7);
//        queue.add(6);
//        queue.add(5);
//        queue.add(4);
//        queue.add(3);
//        queue.add(2);
//        queue.add(1);
