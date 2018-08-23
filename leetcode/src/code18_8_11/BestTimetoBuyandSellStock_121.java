package code18_8_11;

/**
 * @author zjg
 * @date 2018/8/11 14:45
 * @Description
 */
public class BestTimetoBuyandSellStock_121 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int len = prices.length;
        int [] profit = new int[len];

        for (int i = 0; i < len; i++) {
            profit[i] = afterMax(i,prices);
        }

        int max = afterMax(0,profit);
        return max == 0 ? profit[0] : max + profit[0];
    }

    /**
     * 得到当前位置所能得到的最大利益
     */
    private int afterMax (int index, int [] arr) {
        int maxValue = arr[index];
        for (int i = index+1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue > arr[index] ? maxValue-arr[index] : 0;
    }

    public static void main(String[] args) {
        int result = new BestTimetoBuyandSellStock_121().maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(result);
    }
}
