package 随笔.面试.笔试.小米;

/**
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/9/6 19:21
 **/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main1 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int solution(int[] prices, int budget) {
        Arrays.sort(prices);
        int result1 = 0;
        if (budget == 0 || (prices != null && prices[0] > budget)) {
            return -1;
        }
        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[i] <= budget) {
                result1 += budget / prices[i];
                budget %= prices[i];
            }
            if (budget == 0) {
                return result1;
            }
        }
        int[] result = new int[budget + 1];
        result[0] = 0;
        for (int i = 1; i <= budget; i++) {
            int cost = Integer.MAX_VALUE;
            for (int coin : prices) {
                if (i - coin >= 0 && (result[i - coin] != Integer.MAX_VALUE)) {
                    cost = Math.min(cost, result[i - coin] + 1);
                }

            }
            result[i] = cost;
        }
        return result[budget] == Integer.MAX_VALUE ? -1 : result[budget];

    }

    /******************************结束写代码******************************/


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _prices_size = 0;
        _prices_size = Integer.parseInt(in.nextLine().trim());
        int[] _prices = new int[_prices_size];
        int _prices_item;
        for (int _prices_i = 0; _prices_i < _prices_size; _prices_i++) {
            _prices_item = Integer.parseInt(in.nextLine().trim());
            _prices[_prices_i] = _prices_item;
        }

        int _budget;
        _budget = Integer.parseInt(in.nextLine().trim());

        res = solution(_prices, _budget);
        System.out.println(String.valueOf(res));

    }
}
