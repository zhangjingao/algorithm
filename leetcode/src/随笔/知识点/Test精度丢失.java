package 随笔.知识点;

import java.math.BigDecimal;

/**
 * @author zjg
 * <p> 2019/4/26 9:19 </p>
 */
public class Test精度丢失 {

    public static void main(String[] args) {
        System.out.println((double) 1/3);
        System.out.println((double) 1/6);
        BigDecimal decimal1 = new BigDecimal("1");
        BigDecimal decimal2 = new BigDecimal("3");
        System.out.println(decimal1.divide(decimal2,3,BigDecimal.ROUND_HALF_UP));

    }

}
