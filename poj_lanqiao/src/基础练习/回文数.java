package 基础练习;

/**
 * @author zjg
 * @date 2018/3/22 17:43
 * @Description
 */
public class 回文数 {

    public static void main(String[] args) {
        String temp;
        char[] chars;
        boolean boo = true;
        for (int i=1000;i<=9999;i++) {
            temp = i+"";
            chars = temp.toCharArray();//1001
            for (int j=0;j<chars.length/2;j++) {
                if (chars[j]!=chars[chars.length-1-j]) {
                    boo = false;
                    break;
                }
            }
            if (boo) {
                System.out.println(i);
            }
            boo = true;
        }
    }
}
