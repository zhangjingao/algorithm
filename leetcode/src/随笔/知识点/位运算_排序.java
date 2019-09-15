package 随笔.知识点;

/**
 * @author zjg
 * @ClassName 位运算_排序
 * @Description TODO
 * @Date 2019/8/14 14:03
 **/
public class 位运算_排序 {

    private static void sort (int[] arr) {
        int byteLength = arr.length / 8 + 1;
        byte[] bytes = new byte[byteLength];
        for (int i = 0; i < arr.length; i++) {
            long bitIndex = arr[i];
            int byteIndex = (int) (bitIndex / 8);
            int innerByteIndex = (int) (bitIndex % 8);
            bytes[byteIndex] = (byte) (bytes[byteIndex] | 1 << innerByteIndex);
        }
        for (int i = 0; i < byteLength; i++) {
            for (int j = 0; j < 8; j++) {
                if ((bytes[i] & 1 << j) != 0) {
                    System.out.println(i * 8 + j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 6};
        位运算_排序.sort(arr);

    }

}
