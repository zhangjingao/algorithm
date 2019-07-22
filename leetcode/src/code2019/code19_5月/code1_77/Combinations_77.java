package code2019.code19_5月.code1_77;

import java.util.*;

/**
 * @author zjg
 * <p> 2019/5/1 20:53 </p>
 */
public class Combinations_77 {

    private List<List<Integer>> allList = new LinkedList<>();

    //用时629ms
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        work(arr, 0, "", k);
        return allList;
    }

    private void work(int[] arr, int index, String path, int k) {
        if (index <= arr.length) {
            String[] paths = path.split(",");
            if (paths.length == k + 1) {
                List<Integer> list = new ArrayList<>(k);
                for (int i = 1; i < k+1; i++) {
                    list.add(Integer.parseInt(paths[i]));
                }
                allList.add(list);
            } else {
                for (int i = index; i < arr.length; i++) {
                    work(arr, i + 1, path +","+ arr[i], k);
                }
            }
        }
    }

    /*
    2ms的代码
       List<List<Integer>> KinNOfAll = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {


        List<Integer> KinN = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            KinN.add(0);
        }

        recusive(n, k, KinN, k);

        return KinNOfAll;
    }

    private void recusive(int n, int k, List<Integer> kinN, int k1) {

        int i = n;
        if (k > n)
            return;
        while (i >= k) {
            kinN.set(k1 - k, i);
            if (k > 1)
                recusive(i - 1, k - 1, kinN, k1);
            else
                KinNOfAll.add(new ArrayList<>(kinN));
            i--;
        }
    }

     */

    public static void main(String[] args) {
        int n = 10, k = 4;
        new Combinations_77().combine(n, k);
    }

}