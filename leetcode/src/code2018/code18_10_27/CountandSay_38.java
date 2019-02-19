package code2018.code18_10_27;

/**
 * @author zjg
 * <p> 2018/10/27 15:28 </p>
 */
public class CountandSay_38 {

    public String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
//            String tmp = result;
            StringBuilder tempResult = new StringBuilder();
            char before = result.charAt(0);
            int num = 1;
            for (int j = 0; j < result.length(); j++) {
                if (j+1 == result.length() || result.charAt(j) != result.charAt(j+1)) {
                    tempResult.append(num).append(before);
                    num = 1;
                    if (j+1 != result.length()) {
                        before = result.charAt(j + 1);
                    }
                } else {
                   num++;
                }
            }
            result = tempResult.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CountandSay_38().countAndSay(2));
    }

}
