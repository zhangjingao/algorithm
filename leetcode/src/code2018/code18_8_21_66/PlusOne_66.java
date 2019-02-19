package code2018.code18_8_21_66;

/**
 * @author zjg
 * <p> 2018/8/21 8:42 </p>
 */
public class PlusOne_66 {

    public int[] plusOne(int[] digits) {
        int tmp = 1;//末位加的值以及进位的值
        for (int i = digits.length-1; i >= 0; i--) {
            int num = digits[i]+tmp;
            if (num == 10) {
                digits[i] = 0;
                tmp = 1;
            } else {
                tmp = 0;
                digits[i] = num;
                break;
            }
        }
        if (tmp != 0) {
            int[] arr = new int[digits.length+1];
            arr[0] = tmp;
            System.arraycopy(digits, 0, arr, 1, digits.length);
            return arr;
        }
        return digits;
    }

}
