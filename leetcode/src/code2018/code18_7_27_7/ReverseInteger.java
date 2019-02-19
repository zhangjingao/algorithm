package code2018.code18_7_27_7;

/**
 * @author zjg
 * @date 2018/7/27 20:07
 * @Description
 */
public class ReverseInteger {

    public int reverse(int x) {
        StringBuilder builder = new StringBuilder();
        if (x < 0) {
            builder.append("-");
            x = x * -1;
        }
        if (x == 0) {
            return Integer.parseInt(builder.append("0").toString());
        }
        int num = 0;
        int remainder = x%10;//余数
        int divisor = x/10;//除数
        while (remainder == 0) { //说明尾数有0
            remainder = divisor%10;
            divisor = divisor/10;
            num++;
        }
        String xString = x+"";
        for (int i = xString.length()-num-1; i >= 0; i--) {
            builder.append(xString.charAt(i));
        }
        if (builder.charAt(builder.toString().length()-1) ==  '-') {
            builder.deleteCharAt(builder.toString().length()-1);
        }
        long result = Long.parseLong(builder.toString());
        if (result > Integer.MAX_VALUE) {
            result = 0;
        } else if (result < Integer.MIN_VALUE) {
            result = 0;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseInteger().reverse(-2147483648));
    }

}
