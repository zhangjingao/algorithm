package code2019.code19_1_17_9;

/**
 * @author zjg
 * <p> 2019/1/17 20:28 </p>
 */
public class PalindromeNumber_9 {

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int length = str.length();
        int index = -1;
        while (++index < length/2) {
            if (str.charAt(index) != str.charAt(length-index-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(
                new PalindromeNumber_9().isPalindrome(100)
        );
    }

}
