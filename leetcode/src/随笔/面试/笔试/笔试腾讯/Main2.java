package 随笔.面试.笔试.笔试腾讯;

import java.util.*;

/**
 * @author zjg
 * <p> 2019/4/5 20:48 </p>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int len = sca.nextInt();
        String str = sca.next();
        char[] arr = str.toCharArray();
        List<Character> characters = new LinkedList<>();
        for (int i = 0; i < len; i++) {
            characters.add(arr[i]);
        }

        int index = 0;
        while (index < characters.size() - 1 && characters.size() > 1) {
            if ((characters.get(index) == '0' && characters.get(index + 1) == '1')
                    || (characters.get(index) == '1' && characters.get(index + 1) == '0')) {
                characters.remove(index + 1);
                characters.remove(index);
                if (index > 0) {
                    index--;
                }
            } else {
                index++;
            }
        }
        System.out.println(characters.size());
    }

}
