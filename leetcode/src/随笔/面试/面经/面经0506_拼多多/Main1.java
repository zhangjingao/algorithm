package 随笔.面试.面经.面经0506_拼多多;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/5/6 15:35 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int k = sca.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sca.nextInt();
        }
        int[] arrNum = new int[10];
        //将数字的个数填入数组
        for (int i = 0; i < n; i++) {
            arrNum[arr[i]]++;
        }
        //记录花销
        int[] cost = new int[10];
        writeCost(cost, arrNum, k);

    }

    //计算花销
    private static void writeCost(int[] cost, int[] arrNum, int k) {
        for (int i = 0; i < 10; i++) {
            int goFrontIndex = i - 1;
            int goBackIndex = i + 1;
            while (goFrontIndex >=0 && goBackIndex < 10) {
                //定一个大于10的数
                int frontCost = 100, backCost = 100;
                if (arrNum[goFrontIndex] != 0) {
                    frontCost = i - goFrontIndex;
                }
                if (arrNum[goBackIndex] != 0) {
                    backCost = goBackIndex - i;
                }
                //两者都为空
                if (frontCost == -1 && backCost == -1) {
                    goFrontIndex--;
                    goBackIndex++;
                } else if (frontCost < backCost) {
                    cost[i] += frontCost;
                    goFrontIndex--;
                } else if (frontCost > backCost) {
                    cost[i] += frontCost;
                    goFrontIndex--;
                }
            }

        }

    }

}
