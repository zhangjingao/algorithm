package code18_8_12_compet;

import java.util.*;

/**
 * @author zjg
 * @date 2018/8/12 9:18
 * @Description
 */
public class UncommonWordsfromTwoSentences_888 {

    public String[] uncommonFromSentences(String A, String B) {
        String[] stringsA = A.split(" ");
        //将所有单词记录一遍
        Set<String> stringSet = new HashSet<>();
        //记录重复的
        Set<String> replace = new HashSet<>();
        for (String a : stringsA) {
           if (!stringSet.add(a)) {
               replace.add(a);
           }
        }
        String [] stringsB = B.split(" ");
        for (String b : stringsB) {
            if (!stringSet.add(b)) {
                replace.add(b);
            }
        }
        //从一遍中删除掉重复的
        for (String rep : replace) {
            if (stringSet.contains(rep)) {
                stringSet.remove(rep);
            }
        }
        //赋值给string数组
        String[] result = new String[stringSet.size()];
        int[] index = {0};
        stringSet.forEach(s -> {
            result[index[0]] = s;
            index[0]++;
        });

        return result;
    }

    public static void main(String[] args) {
        String[] arr = new UncommonWordsfromTwoSentences_888().uncommonFromSentences("s z z z s","s z ejt");
        for (String a : arr) {
            System.out.println(a);
        }
    }

}
