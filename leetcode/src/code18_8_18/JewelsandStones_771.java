package code18_8_18;

/**
 * @author zjg
 * @date 2018/8/18 15:44
 * @Description
 */
public class JewelsandStones_771 {

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        char[] stones = S.toCharArray();
        for (char stone : stones) {
            if (J.contains(stone+"")) {
                result++;
            }
        }
        return result;
    }

}
