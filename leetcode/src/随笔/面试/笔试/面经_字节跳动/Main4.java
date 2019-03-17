package 随笔.面试.笔试.面经_字节跳动;

/**
 * @author zjg
 * <p> 2019/3/1 10:25 </p>
 */
public class Main4 {

    int BinarySearchMax(int[] data, int target)

    {

        int left = 0;

        int right = data.length;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (mid >= data.length) {
                right--;
                break;
            }
            if (data[mid] <= target) {
                left = mid + 1;
            }
            else

                right = mid - 1;

        }

        if (data[right] == target)

            return right;

        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,5,5,6,7};
        System.out.println(
            new Main4().BinarySearchMax(arr,5)
        );
    }

}
