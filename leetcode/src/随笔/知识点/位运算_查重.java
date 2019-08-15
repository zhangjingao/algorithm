package 随笔.知识点;

import java.util.Random;

/**
 * @author zjg
 * @ClassName 位运算_查重
 * @Description 对整数4、3、1、7、6进行排序
 * @Date 2019/8/13 14:47
 **/
public class 位运算_查重 {

    //数字容量
    private static final int LENGTH = 1000000000;

    //存储所有的数据
    private static byte[] arr = new byte[1 << 29];

    public static void work (int num) {
        //在虚拟的bit数组中的位置
        long bitIndex = num + (1L << 31);
        //在实际的bit数组中的位置
        int byteIndex = (int) (bitIndex / 8);
        //在具体的bit一字节的位置
        int innerByteIndex = (int) (bitIndex % 8);
//        System.out.println("num: "+num+" bit位置为： "+bitIndex+" 字节位置为："+byteIndex+" 具体位置："+innerByteIndex);
        arr[byteIndex] = (byte) (arr[byteIndex] | 1 << innerByteIndex);
    }

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < LENGTH; i++) {
            int num = random.nextInt();
            work(num);
        }
        System.out.println(arr[268435456]);
        for (int i = 0; i < LENGTH; i++) {
            for (int j = 0; j < 8; j++) {
                if ((arr[i] & 1 << j) != 0) {
                    System.out.println(((long)(arr[i] * 8) + j) - (1 << 31));
                }
//                System.out.println(arr[268435456]);
            }
        }

    }




}
