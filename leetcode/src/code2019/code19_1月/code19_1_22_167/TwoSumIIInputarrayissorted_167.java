package code2019.code19_1月.code19_1_22_167;

/**
 * @author zjg
 * <p> 2019/1/22 20:33 </p>
 */
public class TwoSumIIInputarrayissorted_167 {

    //O（n）复杂度实现
 /*   public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left+1,right+1};
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{};
    }
    */

    //二分实现
    public int[] twoSum(int[] numbers, int target) {
        int right;
        int mid;
        int left = 0;
        for (int i = 0; i < numbers.length; i++) {
            right = numbers.length-1;
            int index1 = numbers[i];
            left = i+1;
            while (left <= right) {
                mid = (left+right)/2;
                if (index1 + numbers[mid] == target) {
                    return new int[]{i+1, mid+1};
                } else if (index1 + numbers[mid] > target) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = new TwoSumIIInputarrayissorted_167().twoSum(new int[]{0,0,2,4},0);
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }

}
