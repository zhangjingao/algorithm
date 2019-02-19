package code2019.code19_1_21_69;

/**
 * @author zjg
 * <p> 2019/1/21 11:42 </p>
 */
public class Sqrt_69 {

    public int mySqrt(int x) {
        if (x == 1) {
            return 1;
        }
        int mid = x/2;
        return erFen(mid, x, x);
    }

    public int erFen (long mid,long max, int x) {
        if ( (long)mid * mid == x || ((long)mid*mid < x && (long)(mid+1)*(mid+1) > x )) {
            return (int)mid;
        } else if ((long)mid * mid  < x) {
            return erFen((long)(mid+1+max)/2,max,x);
        } else {
            return erFen((mid-1)/2,mid, x);
        }
    }

    public static void main(String[] args) {
        System.out.println(
                new Sqrt_69().mySqrt(1024)
        );
    }

}
