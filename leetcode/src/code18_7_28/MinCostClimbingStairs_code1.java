package code18_7_28;

/**
 * @author zjg
 * @date 2018/7/28 15:01
 * @Description
 */
public class MinCostClimbingStairs_code1 {

    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if(len==2) {
            return Math.min(cost[0], cost[1]);
        }
        int [] arr = new int[len+1];
        arr[0] = cost[0];
        arr[1] = cost[1];
        for(int i=2;i <= len;i++){
            int curr = 0;
            if (i != len) {
                curr = cost[i];
            }
            arr[i] = Math.min(arr[i-2],arr[i-1])+curr;
        }
        return arr[len];
    }

    public static void main(String[] args) {
        int [] arr = {0,0,1,1};
        MinCostClimbingStairs_code1 m = new MinCostClimbingStairs_code1();
        System.out.println(m.minCostClimbingStairs(arr));
    }

}
