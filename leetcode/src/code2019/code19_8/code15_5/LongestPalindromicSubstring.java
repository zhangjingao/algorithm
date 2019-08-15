package code2019.code19_8.code15_5;

/**
 * @author zjg
 * @ClassName LongestPalindromicSubstring
 * @Description TODO  abbcd
 * @Date 2019/8/15 11:56
 **/
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        String max = "";
        for (int i = 0; i < arr.length; i++) {
            String tmp = judge(arr, i);
            if (tmp != null && tmp.length() > max.length()){
                max = tmp;
            }
        }
        return max;
    }

    private String judge(char[] arr, int index) {
        String result = null;
        //偶数位时，一定是向右遍历
        int leftIndex = index;
        int rightIndex = index + 1;
        while (leftIndex >= 0 && rightIndex < arr.length && arr[leftIndex] == arr[rightIndex]) {
            leftIndex--;
            rightIndex++;
        }
//        sum = rightIndex - leftIndex - 1;
        result = new String(arr, leftIndex + 1, rightIndex - leftIndex - 1);
        //奇数位，左右遍历
        int leftIndex2 = index - 1;
        int rightIndex2 = index + 1;
        while (leftIndex2 >= 0 && rightIndex2 < arr.length && arr[leftIndex2] == arr[rightIndex2]) {
            leftIndex2--;
            rightIndex2++;
        }
        if (rightIndex - leftIndex - 1 < rightIndex2 - leftIndex2 - 1) {

            result = new String(arr, leftIndex2 + 1, rightIndex2 - leftIndex2 - 1);
//            System.out.println(leftIndex2+ " "+rightIndex2 +" "+result);
        }
        return result;
    }

    public static void main(String[] args) {
        new LongestPalindromicSubstring().longestPalindrome("aadbsb");
    }

}
