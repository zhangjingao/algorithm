package 算法训练;

/**
 * @author zjg
 * @date 2018/3/30 10:02
 * @Description
 */
public class 水仙花数 {

    public static void main(String[] args) {
        int bai,shi,ge;
        for (int i = 100; i < 1000; i++) {
            bai = (int) Math.pow(i/100,3);
            shi = (int) Math.pow(i%100/10,3);
            ge = (int) Math.pow(i%100%10,3);
            if (bai+shi+ge == i) {
                System.out.println(i);
            }
        }
    }
}
