package code2019.code19_2_14_60;

import com.sun.nio.sctp.PeerAddressChangeNotification;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author zjg
 * <p> 2019/2/14 10:23 </p>
 */
public class PermutationSequence {

    public String getPermutation(int n, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        while (count <= n) {
            stringBuilder.append(count++);
        }
        List<String> strings = new ArrayList<>();
        allSort(strings, k ,stringBuilder.toString(), 0);
        strings.forEach(System.out::println);
        System.out.println("--");
        return strings.get(k-1);
    }

    private void allSort (List<String> strings, int k ,String str, int index) {
        if (index == str.length()) {
            strings.add(str);
        } else {
            for (int i = index; i < str.length(); i++) {
                str = swap(str, i, index);
                allSort(strings, k ,str, index+1);
                str = swap(str, i, index);
            }
        }
    }

    private String swap (String str, int n, int m) {
        char[] chars = str.toCharArray();
        char temp = chars[n];
        chars[n] = chars[m];
        chars[m] = temp;
        return new String(chars);
    }


    public static void main(String[] args) {
        System.out.println(
                new PermutationSequence().getPermutation(3,5)
        );
    }

}
