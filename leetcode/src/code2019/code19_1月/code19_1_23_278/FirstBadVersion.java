package code2019.code19_1月.code19_1_23_278;

/**
 * @author zjg
 * <p> 2019/1/23 15:18 </p>
 */
public class FirstBadVersion {

    public int firstBadVersion(int n) {
        long left = 1, right = n,mid;
        while (left <= right) {
            mid = left + right >> 1;
            //此处注释掉，由于该处需要调用leetcode已经封装好的父类的方法，此地无法模拟
//            if (isBadVersion((int)mid) && !isBadVersion((int)mid-1) ) {
//                return (int)mid;
//            } else if (isBadVersion((int)mid)) {
//                right = mid-1;
//            } else {
//                left = mid+1;
//            }
        }
        return 0;
    }

}
