package 随笔.知识点;

/**
 * @author zjg
 * @ClassName 位运算_返回确认缺失数字
 * @Description TODO
 * @Date 2019/8/14 15:23
 **/
public class 位运算_返回确认缺失数字 {

    private static byte[] arr = new byte[1 << 29];

    private static void work (int num) {
        long bitIndex = num + (1L << 31);
        int byteIndex = (int) (bitIndex / 8);
        int innerIndex = (int) (bitIndex % 8);
        arr[byteIndex] = (byte) (arr[byteIndex] | 1 << innerIndex);
    }

    public static void main(String[] args) {
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            //假设10不加进去
            if (i == 10) {
                continue;
            }
            work(i);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 8; j++) {
                if ((arr[i] & 1 << j) == 0) {
                    System.out.println(((long) i * 8 + j) - (1L << 31));
                    return;
                }
            }
        }
    }

}
