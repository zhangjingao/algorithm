package code2019.code19_2_28_171;

/**
 * @author zjg
 * <p> 2019/2/28 20:05 </p>
 */
public class ExcelSheetColumnNumber_171 {

    public int titleToNumber(String s) {
        int sum = 0;
        char[] arr = s.toCharArray();
        int temp;
        int tempSum;
        for (int i = 0; i < arr.length; i++) {
            tempSum = 1;
            temp =  arr.length-1-i;
            if (temp != 0) {
                while (temp-- > 0) {
                    tempSum *= 26;
                }
            }
            sum += ((int)arr[i] - 64) * tempSum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(
                new ExcelSheetColumnNumber_171().titleToNumber("ZY")
        );
    }

}
