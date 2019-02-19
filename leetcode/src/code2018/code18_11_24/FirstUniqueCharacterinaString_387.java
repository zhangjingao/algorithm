package code2018.code18_11_24;

/**
 * @author zjg
 * <p> 2018/11/24 17:41 </p>
 */
public class FirstUniqueCharacterinaString_387 {

    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        char temp;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            if (temp == '#') {
                continue;
            }
            boolean boo = true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == temp) {
                    boo = false;
                    arr[j] = '#';
                }
            }
            if (boo) {
                return i;
            }
        }

        return -1;
    }

}
