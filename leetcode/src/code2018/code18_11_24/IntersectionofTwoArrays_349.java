package code2018.code18_11_24;

import java.util.*;

/**
 * @author zjg
 * <p> 2018/11/24 14:42 </p>
 */
public class IntersectionofTwoArrays_349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        Set<Integer> sets = new HashSet<>();
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        //先将num1全放sets里
        for (int i = 0; i < len1; i++) {
            sets.add(nums1[i]);
        }
        for (int j = 0; j < len2; j++) {
            if (sets.contains(nums2[j])) {
                result.add(nums2[j]);
            }
        }
        int [] arr = new int[result.size()];
        Object[] a = result.toArray();
        for (int i = 0; i < a.length; i++) {
            arr[i] = (int) a[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        new IntersectionofTwoArrays_349().intersection(new int[]{1,2,2,1}, new int[]{2,2});
    }

}
