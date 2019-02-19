package code2018.code18_9_1;

import static java.lang.Math.min;

/**
 * @author zjg
 * <p> 2018/9/1 16:50 </p>
 */
public class CoinChange_322 {

    public int coinChange(int[] coins, int amount) {
        //初始化答案数组
        if( amount == 0 ){
            return 0;
        }
        int [] ans = new int[amount+1];
        for( int i = 0 ; i < coins.length ; ++i){
            if( coins[i] > amount ){
                continue;
            }
            ans[coins[i] ] = 1;
        }
        for( int i = 1 ; i <= amount ; ++i ){
            //已经初始化过
            if( ans[i] != 0 ){
                continue;
            }
            //mi用来保存临时最小值
            int mi = Integer.MAX_VALUE;
            for( int j = 0 ; j < coins.length ; ++j ){
                //上一次的面额不合法
                if( i - coins[j] <= 0 || ans[ i - coins[j] ] == 0 ){
                    continue;
                }
//                System.out.println(ans[i - coins[j]  ]+1+" -- "+i+j);
                mi = Math.min( mi , ans[i - coins[j]  ] + 1);
            }
            mi = mi == Integer.MAX_VALUE ? 0 : mi ;
            ans[i] = mi;
        }
//        for (int i : ans) {
//            System.out.print(i+" ");
//        }
        return ans[amount] == 0 ? -1 : ans[amount];

    }

    public static void main(String[] args) {
        System.out.println(
                new CoinChange_322().coinChange(new int[]{1,3,5},11)
        );
    }

}
