package code2019.code19_4月.code19_4_29_122;

/**
 * @author zjg
 * <p> 2019/4/29 9:21 </p>
 */
public class BestTimetoBuyandSellStockII_122 {

    //我的 4ms
/*    public int maxProfit(int[] prices) {
        int sum = 0;
        int len = prices.length;
        int start = 0;
        for (int i = 1; i < len; i++) {
            //如果数变小了，证明可以从这个地方截一次
            if (prices[i] < prices[i-1]) {
                sum += work(start, i - 1, prices);
                start = i;
            }
            if (i == len - 1) {
                sum += work(start, i, prices);
                start = i;
            }
        }
        return sum;
    }

    private int work(int start, int end, int[] prices) {

        int min = prices[start], max;
        int minIndex = start;
        //寻找峰谷
        for (int i = start; i <= end; i++) {
            if (prices[i] < min) {
                min = prices[i];
                minIndex = i;
            }
        }
        max = min;
        //在峰谷之后寻找峰顶
        for (int i = minIndex; i <= end; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }
//        System.out.println(start+" "+end+" "+ min+" "+max);
        return max- min;
    }*/

    //1ms
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int result = 0;
        int buy = 0, sell = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i-1]) { //钱变少就卖出，否则将当前作为销售点
                result += prices[sell] - prices[buy];
                buy = i;
                sell = i;
            } else {
                sell = i;
            }
        }
        result += prices[sell] - prices[buy];
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(
                new BestTimetoBuyandSellStockII_122().maxProfit(arr)
        );
    }

}
