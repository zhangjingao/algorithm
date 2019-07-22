package 随笔.面试.笔试.笔试完美世界;

import java.util.*;

/**
 * @author zjg
 * <p> 2019/4/14 10:01 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        List<Integer> arr1 = new ArrayList<>(n);
        List<Integer> arr2 = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr1.add(sca.nextInt());
        }
        for (int i = 0; i < n; i++) {
            arr2.add(sca.nextInt());
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1.get(i) < arr1.get(j)) {
                    int temp = arr1.get(i);
                    arr1.set(i,arr1.get(j));
                    arr1.set(j, temp);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr2.get(i) < arr2.get(j)) {
                    int temp = arr2.get(i);
                    arr2.set(i,arr2.get(j));
                    arr2.set(j, temp);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if (arr1.get(i) >= arr2.get(j)) {
                    sum += arr1.get(i).equals(arr2.get(j)) ? 0 : 100;
                    arr1.remove(i);
                    i--;
                    arr2.remove(j);
                    break;
                }
                if (j == arr2.size()-1) {
                    sum -= 100;
                    arr1.remove(i);
                    i--;
                    arr2.remove(j);
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
