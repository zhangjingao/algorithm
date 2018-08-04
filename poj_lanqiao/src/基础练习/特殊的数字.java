package 基础练习;

/**
 * @author zjg
 * @date 2018/3/22 17:51
 * @Description
 */
public class 特殊的数字 {

    public static void main(String[] args) {
        int ge,shi,bai;
        for (int i=100;i<=999;i++) {
            bai = i/100;
            shi = i%100/10;
            ge = i%100%10;
            if (Math.pow(bai,3)+Math.pow(shi,3)+Math.pow(ge,3)==i) {
                System.out.println(i);
            }
        }
    }
}
