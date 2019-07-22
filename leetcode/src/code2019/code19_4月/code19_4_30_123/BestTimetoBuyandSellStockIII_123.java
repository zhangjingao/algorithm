package code2019.code19_4月.code19_4_30_123;

/**
 * @author zjg
 * <p> 2019/4/30 21:10 </p>
 */
public class BestTimetoBuyandSellStockIII_123 {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        //分别记录两次的情况
        int buy1 = Integer.MIN_VALUE, sell1 = 0;
        int buy2 = Integer.MIN_VALUE, sell2 = 0;
        for (int p :prices) {
            buy1 = Math.max(buy1, -p);
            sell1 = Math.max(sell1, buy1 + p);
            buy2 = Math.max(buy2, sell1 - p);
            sell2 = Math.max(sell2, buy2 + p);
        }
        return sell2;
    }


    public static void main(String[] args) {
//        int[] price = {6,1,3,2,4,7};// 6,1,3,2,4,7  ,2,7,6,9
        int[] price = {6,1,3,2,4,7  ,2,7,6,9};// 6,1,3,2,4,7  ,2,7,6,9
        System.out.println(
                new BestTimetoBuyandSellStockIII_123().maxProfit(price)
        );
    }

}
