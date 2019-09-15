package 随笔.面试.笔试.携程2;

/**
 * @author zjg
 * @ClassName Main2
 * @Description TODO
 * @Date 2019/9/4 19:45
 **/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static String resolve(String expr) {
        int len = expr.length();
        int index = -1;
        List<Stack<Character>> list = new ArrayList<>();
        Stack<Character> first = new Stack<>();
        list.add(first);
        int stackIndex = 0;
        while (++index < len) {
            if (expr.charAt(index) == '(') {
                Stack<Character> stack = new Stack<>();
                list.add(stack);
                stackIndex++;
                continue;
            }
            if (expr.charAt(index) == ')') {
                if (stackIndex <= 0) {
                    return "";
                }
                Stack<Character> stack = list.get(stackIndex);
                stackIndex--;
                if (stackIndex < 0) {
                    //直接取出
                    StringBuilder stringBuilder = new StringBuilder("");
                    while (!stack.isEmpty()) {
                        stringBuilder.append(stack.pop());
                    }
                    return stringBuilder.toString();
                } else {
                    while (!stack.isEmpty()) {
                        list.get(stackIndex).push(stack.pop());
                    }
                }
                continue;
            }
           /* if (stackIndex < 0) {
                return "";
            }*/
            list.get(stackIndex).push(expr.charAt(index));
        }
        if (stackIndex == 0) {

            Stack<Character> tmp = new Stack<>();
            while (!first.isEmpty()) {
                tmp.push(first.pop());
            }
            if (!tmp.isEmpty()) {
                while (!tmp.isEmpty()) {
                    System.out.print(tmp.pop());
                }
            }
        }
        return "";
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _expr;
        try {
            _expr = in.nextLine();
        } catch (Exception e) {
            _expr = null;
        }

        res = resolve(_expr);
        System.out.println(res);
    }
}
