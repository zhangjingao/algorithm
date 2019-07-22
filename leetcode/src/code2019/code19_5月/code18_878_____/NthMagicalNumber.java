package code2019.code19_5月.code18_878_____;

/**
 * @author zjg
 * <p> 2019/5/18 10:17 </p>
 */
public class NthMagicalNumber {

    public int nthMagicalNumber(int N, int A, int B) {
        long index = 2;
        while (true) {
            if (index % A == 0 || index % B == 0) {
                N--;
            }
//            System.out.println(index+" "+N);
            if (N == 0) {
                return (int) (index % ((long) (Math.pow(10, 9) + 7)));
            }
            index++;
        }
    }

    public static void main(String[] args) {
        System.out.println(
                new NthMagicalNumber().nthMagicalNumber(1000000000,
                        40000,
                        40000)
        );
    }

}
