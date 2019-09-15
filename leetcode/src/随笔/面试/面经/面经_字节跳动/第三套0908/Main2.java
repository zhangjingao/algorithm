package 随笔.面试.面经.面经_字节跳动.第三套0908;

/**
 * @author zjg
 * @ClassName Main2
 * @Description TODO
 * @Date 2019/9/8 19:11
 **/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Main2 {

    Set<State> states = new HashSet<>();    //用于存储已经搜索过的状态的集合
    Stack<State> order = new Stack<>();     //用于存储已经搜索过的状态的顺序，用于最后输出
    Stack<Action> actions = new Stack<>();  //用于存储已经进行过的操作

    //水桶的状态，分别对应8L、5L和3L的水桶
    Bucket[] buckets = {new Bucket(8), new Bucket(5), new Bucket(3)};

    public void search(final State s) {
        if (isFinalState(s)) {
            printAction();
            printOrder();
            return;
        }

        states.add(s);
        order.push(s);

        //遍历所有可能的倒水动作
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isLegal(i, j, s)) continue;   //判断从i桶向j桶倒水是否可行
                final State newState = update(i, j, s); //如果可行则更新状态，并将对应的操作入栈
                if (hasSearched(newState)) {
                    actions.pop();
                    continue;  //如果此状态已经搜索过则跳过，避免状态陷入环路
                }
                search(newState);
                actions.pop();
                states.remove(newState);  //搜索完newState之后需要把它移出已经搜索过的状态的集合，切记！！！
            }
        }
        order.pop();
    }

    private void printAction() {
        System.out.println();
        System.out.println();
        for (int i = 0; i < actions.size(); i++) {
            System.out.println(actions.elementAt(i));
        }
        System.out.println();
        System.out.println("-----------------------------------");
    }

    private void printOrder() {
        System.out.println();
        System.out.println();
        for (int i = 0; i < order.size(); i++) {
            System.out.println(order.elementAt(i));
        }
        //由于最终状态没有push到order栈里面，所以输出的时候补上
        System.out.println(new State(4, 4, 0));
        System.out.println();
        System.out.println("-----------------------------------");
    }

    private boolean hasSearched(State state) {
        return states.contains(state);
    }

    //在现有的状态上更新，并返回新状态
    private State update(int i, int j, State s) {
        final State newState = new State(s);
        Action action = new Action();
        action.from = i;
        action.to = j;

        if (s.ss[i] > buckets[j].capacity - s.ss[j]) {  //如果i中的水多于j中的剩余容量
            newState.ss[j] = buckets[j].capacity;
            action.water = buckets[j].capacity - s.ss[j];
            newState.ss[i] = s.ss[i] - action.water;
        } else {    //i中的水可以全部倒入j中
            newState.ss[j] = s.ss[j] + s.ss[i];
            newState.ss[i] = 0;
            action.water = s.ss[i];
        }

        actions.push(action);
        return newState;
    }

    //判断在s状态下，从i向j倒水是否合理
    private boolean isLegal(int i, int j, State s) {
        return i != j && s.ss[i] != 0 && s.ss[j] != buckets[j].capacity;
    }

    private boolean isFinalState(State state) {
        return state.ss[0] == 4 && state.ss[1] == 4 && state.ss[2] == 0;
    }

    public void printState(State state) {
        System.out.println("State now: " + state);
    }

    public static void main(String[] args) {
        new Main2().search(new State(8, 0, 0));
    }
}

class Action {
    int from;
    int to;
    int water;   //本次倒了多少水i

    @Override
    public String toString() {
        return "Action{" +
                "from=" + from +
                ", to=" + to +
                ", water=" + water +
                '}';
    }
}

class Bucket {
    int capacity;

    public Bucket(int capacity) {
        this.capacity = capacity;
    }
}

class State {
    final int[] ss;

    public State(int... a) {
        ss = a;
    }

    public State(State s) {
        ss = Arrays.copyOf(s.ss, s.ss.length);
    }

    //由于需要放入Set中，所以重写equals()和hashcode()方法来判断两个State是否相同
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        State state = (State) o;
        return Arrays.equals(ss, state.ss);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(ss);
    }

    @Override
    public String toString() {
        return "State{" + Arrays.toString(ss) + '}';
    }
}