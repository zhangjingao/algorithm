package code18_8_19_compent;

/**
 * @author zjg
 * @date 2018/8/19 10:44
 * @Description
 */
public class class_891 {

    public int sumSubseqWidths(int[] A) {
        int result = 0;
        int len = A.length;
        int numCount;
        for (int i = 0; i< len; i++) {
            numCount = 2;
            for (int j = i+1; j < len; j++) {



                result += getChild(A, i, j);
            }
        }

        return result;
    }

    private int getChild (int [] A, int startIndex, int endIndex) {
        int result = 0;
        int numCount = 2;
        int maxValue = A[startIndex];
        int minValue = A[startIndex];
        for (int i = startIndex; i <= endIndex; i++) {
            if (A[i] > maxValue) {
                maxValue = A[i];
            }
            if (A[i] < minValue) {
                minValue = A[i];
            }
        }
        System.out.println(maxValue+" "+minValue);
        return maxValue-minValue;
    }

    public static void main(String[] args) {
        System.out.println(
                new class_891().sumSubseqWidths(new int[]{2,1,3})
        );
    }

}
