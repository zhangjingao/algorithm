package code2019.code19_5月.code17_821;

import java.util.Arrays;

/**
 * @author zjg
 * <p> 2019/5/17 16:09 </p>
 */
public class ShortestDistancetoaCharacter {

    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int[] arr = new int[len];
        if (len == 0) {
            return arr;
        }
        for (int i = 0; i < len; i++) {
            if (S.charAt(i) == C) {
                arr[i] = 0;
                int left = i;
                int right = i;
                while (--left >= 0) {
                    if (i - left < arr[left] || (arr[left] == 0 && S.charAt(left) != C)) {
                        arr[left] = i - left;
                    } else {
                        break;
                    }
                }
                while (++right < arr.length) {
                    if (right - i < arr[right] || (arr[right] == 0 && S.charAt(right) != C)) {
                        arr[right] = right - i;
                    } else {
                        break;
                    }
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new ShortestDistancetoaCharacter().shortestToChar("loveleetcode",'e');
        System.out.println(Arrays.toString(arr));
    }


}
