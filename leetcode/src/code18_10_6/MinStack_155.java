package code18_10_6;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zjg
 * <p> 2018/10/6 15:23 </p>
 */
public class MinStack_155 {


    public MinStack_155 () {

    }
    private List<Integer> minStack = new LinkedList<>();

    public void push(int x) {
        minStack.add(x);
    }

    public void pop() {
        minStack.remove(minStack.size()-1);
    }

    public int top() {
        return minStack.get(minStack.size()-1);
    }

    public int getMin() {
        int min = minStack.get(0);
        for (int i : minStack) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

}
