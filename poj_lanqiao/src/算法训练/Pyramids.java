package 算法训练;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/23 20:26 </p>
 */
public class Pyramids {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        StringBuilder string = new StringBuilder();
        while (n > 2) {
            int nTemp = n;
            int heightH = 0;
            //高金字塔
            int sum = 0;
            for (int i = 1; i < n; i++) {
                sum += i * i;
                if (sum > n) {
                    n = n - sum + i * i;
                    heightH = i-1;
                    break;
                }
            }
            sum = 0;
            for (int i = 1; i < nTemp; i+=2) {
                sum += i * i;
                if (sum > nTemp) {
                    nTemp = nTemp - sum + i * i;
                    if ((i - 2) > heightH) {
                        string.append(i - 2).append("L\n");
                        n = nTemp;
                    } else {
                        string.append(heightH).append("H\n");
                    }
                    break;
                }
            }

            sum = 0;
            for (int i = 1; i < n; i+=2) {
                sum += i * i;
                if (sum > n) {
                    n = n - sum + i * i;
                    string.append(i - 2).append("L\n");
                    break;
                }
            }

        }
        System.out.println(string.toString()+" "+n);
        if (n > 0) {
            System.out.println("impossible");
        } else {
            System.out.println(string.toString());
        }

    }


}
