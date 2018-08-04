package 算法提高;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/5/20 11:49
 * @Description
 */
public class Main_Torry的困惑提高型 {

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int x = sca.nextInt();
        boolean boo;
        long sum = 1;
        int count = 0; //质数个数
        long zhishu = 2; //质数开始的数
        while (true) {
            boo = true;
            if (zhishu != 2 && zhishu % 2 == 0) { //先将2及2的倍数踢出
                boo = false;
            }
            if (boo) {
                for (int i = 3; i*i <= zhishu; i += 2) {//判断到平方根处就不判了
                    if (zhishu % i == 0) {
                        boo = false;
                        break;
                    }
                }
            }
            if (boo) {
                count++;
                sum = sum * (zhishu%50000) % 50000;//14630
                if (count >= x) {
                    break;
                }
            }
            zhishu++;
        }
        System.out.println(sum);
    }

}
