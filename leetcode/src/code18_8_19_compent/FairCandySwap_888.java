package code18_8_19_compent;

/**
 * @author zjg
 * @date 2018/8/19 9:29
 * @Description
 */
public class FairCandySwap_888 {


    public int[] fairCandySwap(int[] A, int[] B) {
        int [] arr = new int[2];
        int totalA = 0;
        for (int a : A) {
            totalA +=  a;
        }
        int totalB = 0;
        for (int b : B) {
            totalB += b;
        }
        int avg = (totalA+totalB)/2;
        //A与平均值的差
        int chaA = avg - totalA;
        for (int a : A) {
            for (int b : B) {
                if (b == (a+chaA)) {
                    arr[0] = a;
                    arr[1] = a+chaA;
                    return arr;
                }
            }
        }
        return arr;
    }




    public static void main(String[] args) {
        int arr[] = new FairCandySwap_888().fairCandySwap(new int[]{1,1}, new int[]{2,2});
        System.out.println(
                arr[0]+ " "+ arr[1]
        );
    }
}
