package code2019.code19_9.code15_122;

/**
 * @author zjg
 * @ClassName BestTimetoBuyandSellStockII
 * @Description TODO
 * @Date 2019/9/15 14:28
 **/
public class BestTimetoBuyandSellStockII {

    public int maxProfit(int[] prices) {
        int total = 0;
        int len = prices.length;
        if (len <= 1) {
            return 0;
        }
        int before = prices[0];
        for (int i = 0; i < len - 1; i++) {
            if (prices[i] > prices[i + 1]) {
                total += prices[i] - before;
                before = prices[i + 1];
            }
        }
        total += prices[len - 1] - before;
        return total;
    }

    public static void main(String[] args) {
        System.out.println(
                new BestTimetoBuyandSellStockII().maxProfit(new int[]{7,1,5,3,6,4})
        );
    }

}
