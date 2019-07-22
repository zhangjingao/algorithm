package 随笔.面试.笔试.拼多多;

import java.util.*;

/**
 * @author zjg
 * <p> 2019/5/6 19:02 </p>
 */
public class Main1 {

    // 70%
    /*public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String s = sca.next();
        int count = 0;
        char[] arr = s.toCharArray();
        boolean boo = true;
        while (true) {
            for (int i = 0; i >= 0 && i < arr.length; i++) {
                int before, after = -1;
                if (arr[i] == '#') {
                    continue;
                }
                before = i;
                int j = 0;
                for (j = i + 1; j < arr.length; j++) {
                    //找第二个相邻的字符
                    if (arr[j] == '#') {
                        continue;
                    }
                    after = j;
                    break;
                }
                //找不到跳出
                if (before == -1 || after == -1) {
                    boo = false;
                    break;
                }
                if (arr[before] == arr[after]) {
                    arr[before] = '#';
                    arr[after] = '#';
//                    i--;
                    for (int k = i - 1; k >= 0 ; k--) {
                        if (arr[k] == '#') {
                            continue;
                        }
                        i = k -1;
                        break;
                    }
                    count++;
//                    break;
                }
            }
            if (!boo) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }*/

    //ac 使用栈操作
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String s = sca.next();
        int count = 0;
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char anArr : arr) {
            if (!stack.empty() && stack.peek() == anArr) {
                count++;
                stack.pop();
            } else {
                stack.push(anArr);
            }
        }
        System.out.println(count);
    }
}
