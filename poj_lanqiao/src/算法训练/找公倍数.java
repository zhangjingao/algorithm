package 算法训练;

/**
 * @author zjg
 * @date 2018/3/30 10:06
 * @Description
 */
public class 找公倍数 {

    public static void main(String[] args) {
        for (int i = 187; i < 1000; i++) {
            if (i%11 == 0 && i%17 == 0) {
                System.out.println(i);
            }
        }
    }
}
