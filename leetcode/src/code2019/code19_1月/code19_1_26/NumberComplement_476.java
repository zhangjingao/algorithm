package code2019.code19_1月.code19_1_26;

/**
 * @author zjg
 * <p> 2019/1/26 15:54 </p>
 */
public class NumberComplement_476 {

    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (arr[i] ^ 1);
        }
        int numTemp = 0;
        int powerIndex = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            numTemp += (arr[i] - '0') * Math.pow(2, powerIndex++);
        }
        return numTemp;
    }

    /*
    6ms代码，我的11ms
        public int findComplement(int num) {
        int m = 2;
        int ex = 1;
        while(Math.pow(2,ex) <= num){

            ex++;
        }
        long pow = (long)Math.pow(2, ex);
        return (int)(pow -1 - num);
    }
     */

    public static void main(String[] args) {
        new NumberComplement_476().findComplement(9);
    }

}
