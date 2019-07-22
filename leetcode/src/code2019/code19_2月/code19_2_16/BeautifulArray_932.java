package code2019.code19_2月.code19_2_16;

/**
 * @author zjg
 * <p> 2019/2/17 9:04 </p>
 */
public class BeautifulArray_932 {

    public int[] beautifulArray(int N) {
        int[] arrs = new int[N];
        for (int i = 0; i < N; i++) {
            arrs[i] = i+1;
        }

        return null;
    }

    private void allSort (int[] arrs) {

        for (int k = 0; k < arrs.length; k++) {
            for (int i  = k-1; i >= 0; i--){
                for (int j = k + 1; j < arrs.length; j++) {

                }
            }
        }


    }

}
