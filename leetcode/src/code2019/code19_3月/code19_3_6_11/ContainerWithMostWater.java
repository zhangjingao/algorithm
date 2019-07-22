package code2019.code19_3月.code19_3_6_11;

/**
 * @author zjg
 * <p> 2019/3/6 21:16 </p>
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while (left < right) {
            int tempArea = 0;
            if (height[left] >= height[right]) {
                tempArea = (right - left) * (Math.min(height[left],height[right]));
                right--;
            } else {
                tempArea = (right - left) * (Math.min(height[right],height[left]));
                left++;
            }
            if (tempArea > maxArea) {
//                System.out.println(left+" "+right+" "+height[left] +" "+ height[right]);
                maxArea = tempArea;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(
                new ContainerWithMostWater().maxArea(arr)
        );
    }

}
