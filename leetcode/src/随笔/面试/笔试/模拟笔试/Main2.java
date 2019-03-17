package 随笔.面试.笔试.模拟笔试;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/2/20 19:55 </p>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[][] arrs = new int[n][4];
        for (int i = 0; i < n; i++) {
            arrs[i][0] = sca.nextInt();
            arrs[i][1] = sca.nextInt();
            arrs[i][2] = sca.nextInt();
            arrs[i][3] = sca.nextInt();
        }
        for (int i = 0; i < n; i++) {
            judge(arrs[i]);
        }
    }

    private static void judge (int[] arr) {
        if (arr[1] + arr[2] * 2 + arr[3] * 3 < arr[0] * 6) {
            System.out.println("No");
        } else {
            int days = arr[0], one = arr[1], two = arr[2], three = arr[3];
            boolean boo;
            while (days > 0) {
                days--;
                boo = false;
                int sum = 0;
                while (three > 0) {
                    three--;
                    sum += 3;
                    if (sum == 6) {
                        boo = true;
                        break;
                    }
                }
                //当三份的不能单独满足时
                if (!boo) {
                    while (two > 0) {
                        two--;
                        sum += 2;
                        if (sum == 6) {
                            boo = true;
                            break;
                        } else if (sum > 6) {
                            two++;
                            sum -= 2;
                            break;
                        }
                    }
                }
//                System.out.println(sum+" "+ three+" "+two+" "+one);
                //当三份和两份都没解决问题时
                if (!boo) {
                    while (one > 0) {
                        one--;
                        sum++;
                        if (sum == 6) {
                            boo = true;
                            break;
                        }
                    }
                }
                if (!boo) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }



}
