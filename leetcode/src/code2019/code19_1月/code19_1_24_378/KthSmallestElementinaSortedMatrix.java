package code2019.code19_1月.code19_1_24_378;

/**
 * @author zjg
 * <p> 2019/1/24 21:12 </p>
 */
public class KthSmallestElementinaSortedMatrix {

/*    public int kthSmallest(int[][] matrix, int k) {
        int index1, index2;
        long left = matrix[0][0], right = matrix[matrix.length - 1][matrix.length - 1];
        long mid;
        boolean boo = false;//判断是否含有mid
        int result = 0;
        while (left <= right) {
            index1 = 0;
            index2 = 0;
            mid = left + right >> 1;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] < mid) {
                        index1++;
                        index2++;
                    } else if (matrix[i][j] == mid){
                        index2++;
                    } else {
                        continue;
                    }
                }
                if (boo) {
                    break;
                }
            }
            System.out.println(mid+" "+index1+" "+index2+" "+left+" "+right);
            if (index1 <= k && index2 >= k &&( mid < result  || result == 0)) {
                result = (int)mid;
            } else if (index1 > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return result;
    }*/

    public static boolean guess(int[][] matrix, int g, int n, int k){
        int sum = 0;
        for(int i = 0; i < n; i++){
            int L = 0;
            int R = n - 1;
            int ans = 0;
            while (L <= R){
                int mid = L + (R - L)/2;
                //若某一行值小于g，则应该是最后一个元素的下标 + 1.
                if(matrix[i][mid] < g){
                    ans = mid + 1;
                    L = mid + 1;
                }else {
                    R = mid - 1;
                }
            }
            sum += ans;
        }
        return k > sum;
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int L = matrix[0][0];
        int R = matrix[n - 1][n - 1];
        int ans = 0;
        while (L <= R){
            int mid = L + (R - L )/2;
            if(guess(matrix, mid, n, k)){
                ans = mid;
                L = mid + 1;
            }else {
                R = mid - 1;
            }
        }
        return  ans;
    }



    public static void main(String[] args) {
        System.out.println(
                new KthSmallestElementinaSortedMatrix().kthSmallest(
                        new int[][]{{1,5,9},{10,11,13},{12,13,15}}, 8
                )
        );
    }

}
