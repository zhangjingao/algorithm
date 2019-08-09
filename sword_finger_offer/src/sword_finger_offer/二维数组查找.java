package sword_finger_offer;

/**
 * @author zjg
 * @ClassName 二维数组查找
 * @Description TODO
 * @Date 2019/8/8 15:50
 **/
public class 二维数组查找 {

    private static void work(int n, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int[] arry = arr[i];
            int mid = arry.length / 2;
            if (arr[i][mid] >= n) {
                //向左判断
                for (int j = 0; j <= mid; j++) {
                    if (arry[j] == n) {
                        System.out.println("YES");
                        return;
                    }
                }
                //向下遍历
                for (int j = 0; j <= i ; j++) {
                    if (arr[j][mid] == n) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
            System.out.println("NO");
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 5, 10}, {2, 6, 11}, {3, 7, 12}};
        work(9, arr);
    }

}
