package 基础练习;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/3/23 11:35
 * @Description
 */
public class 阶乘计算Care {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int [] sum = new int[2570];
        sum[0] = 1;
        int temp = 0;//当前位数字
        int wei;//当前位需要乘的数
        int tempUp;
        for (int i=1;i<=n;i++) {
            wei = 1;
            tempUp = 0;
            for (int j=0;j<sum.length;j++) {
                temp = i*sum[j]+tempUp;
                sum[j] = temp%1000%100%10;//将该位得到的结果得到个位放到数组中，其余进位
                wei *= 10;
                tempUp = (temp-sum[j])/10;//要进位的数,每次进位只有两位数
            }
        }
        boolean boo = false;
        for (int i=sum.length-1;i>=0;i--) {
            if (sum[i]==0&&!boo) {
                continue;
            }
            boo = true;
            System.out.print(sum[i]);
        }
    }
}
