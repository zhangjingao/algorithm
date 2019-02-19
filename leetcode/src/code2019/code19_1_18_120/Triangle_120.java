package code2019.code19_1_18_120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/1/18 20:19 </p>
 */
public class Triangle_120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int minLen = triangle.get(len-1).size();
        int[] min = new int[minLen+1];
        min[0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            int[] temp = new int[minLen+1];
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int lastLen = triangle.get(i-1).size();
                if (j == 0) {
                    temp[j] = min[j] + triangle.get(i).get(j);
                } else {
                    if (lastLen >= j+1) {
                        temp[j] = Math.min(min[j-1],min[j]) + triangle.get(i).get(j);
                    } else {
                        temp[j] = min[j-1] + triangle.get(i).get(j);
                    }
                }
            }

            min = temp;
        }
        int minValue = min[0];
        for (int i = 1; i < minLen; i++) {
            if (min[i] < minValue) {
                minValue = min[i];
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        List list1 = Arrays.asList(-1);
        List list2 = Arrays.asList(3,2);
        List list3 = Arrays.asList(1,-2,-1);
//        List list4 = Arrays.asList(4,1,8,3);
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
//        lists.add(list4);

        lists.forEach(l->{
            l.forEach(System.out::print);
            System.out.println();
        });
        System.out.println("--");
        System.out.println(
            new Triangle_120().minimumTotal(lists)
        );
    }

}
