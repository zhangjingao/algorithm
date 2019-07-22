package code2019.code19_1月.code19_1_26;

/**
 * @author zjg
 * <p> 2019/1/26 15:03 </p>
 */
public class SortArrayByParityII_922 {

    public int[] sortArrayByParityII(int[] A) {

        for (int i = 0; i < A.length; i++) {
            if (i % 2 == 0 && A[i] % 2 != 0) {
                for (int j = i+1; j < A.length; j+=2) {
                    if (A[j] % 2 == 0) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                    }
                }
            } else if (i % 2 != 0 && A[i] % 2 == 0) {
                for (int j = i+1; j < A.length; j+=2) {
                    if (A[j] % 2 != 0) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                    }
                }
            }
        }

        return A;
    }

}
