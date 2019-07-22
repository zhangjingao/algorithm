package 随笔.面试.笔试.字节跳动2;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/7/2 19:40 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int[] arr = new int[52];
        for (int i = 0; i < 52; i+=2) {
            arr[i] = sca.nextInt();
        }
        for (int i = 1; i < 52; i+=2) {
            arr[i] = sca.nextInt();
        }
        int byteLength = 0;
        int danceLength = 0;
        int[] numAddress = new int[14];//记录下标值牌数出现的位置下标
        for (int i = 0; i < 14; i++) {
            numAddress[i] = -1;
        }
        for (int i = 0; i < 52; i++) {
            int temp = arr[i];      //取得当前牌数
            if (numAddress[temp] == -1) {
                numAddress[temp] = i;
            } else {
                int lastIndex = numAddress[temp]; //上次出现的下标
                int nums = 0; //未使用的牌数
                //System.out.print("出现一次拿牌："+arr[i]+" "+ arr[lastIndex]+"  ");
                for (int j = lastIndex; j <= i; j++) {
                    numAddress[arr[j]] = -1;
                    if (arr[j] != 0) {
                        nums++;
                        //System.out.print(arr[j]+" ");
                        arr[j] = 0;
                    }
                }
                if (i % 2 == 0) {
                    byteLength += nums;
                } else {
                    danceLength += nums;
                }
                //System.out.println();
            }
        }
        //System.out.println(byteLength+" "+danceLength);
        if (byteLength == danceLength) {
            System.out.println("Draw");
        } else if (byteLength > danceLength) {
            System.out.println("Byte");
        } else {
            System.out.println("Dance");
        }

    }

}
