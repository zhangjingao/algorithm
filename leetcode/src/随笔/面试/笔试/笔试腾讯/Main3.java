package 随笔.面试.笔试.笔试腾讯;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/5 21:07 </p>
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                arr[j][i] = sca.nextInt();
            }
        }
        sca.close();
        int money = 0; //需要的花销
        int ability = 0; //当前的战力
        for (int i = 0; i < n; i++) {
            if (arr[i][0] > ability) {
                ability+=arr[i][0];
                money += arr[i][1];
            }
        }
        System.out.println(money);
    }

}
