package 随笔.面试.面经.面经_字节跳动.第三套0908;

import java.util.Scanner;

/**
 * @author zjg
 * @ClassName Main3
 * @Description TODO
 * @Date 2019/9/8 19:35
 **/
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int q = sca.nextInt();
        int m = sca.nextInt();
        String[] chars = new String[n];
        for (int i = 0; i < n; i++) {
            chars[i] = sca.next();
        }
        for (int i = 0; i < m; i++) {
            int left = sca.nextInt();
            int right = sca.nextInt();
            work(left - 1, right - 1, chars.clone());
        }
    }

    private static void work(int left, int right, String[] chars) {
        int total = 0;
        int index = left;
        //判断上一个是否是符号
        boolean isPreFuhao = false;
        //向左或向右，默认向右
        boolean goToLeft = false;
        while (index <= right && index >= left) {
            if ("-1".equals(chars[index])) {
                if (goToLeft) {
                    index--;
                } else {
                    index++;
                }
                continue;
            }
            if (">".equals(chars[index])) {
                if (isPreFuhao) {
                    chars[index] = "-1";
                    if (index == left) {
                        break;
                    }
                } else {
                    isPreFuhao = true;
                    goToLeft = false;
                    index++;
                }
                continue;
            }
            if ("<".equals(chars[index])) {
                if (isPreFuhao) {
                    chars[index] = "-1";
                    if (index == right) {
                        break;
                    }
                } else {
                    isPreFuhao = true;
                    goToLeft = true;
                    index--;
                }
                continue;
            }
            if ("0".equals(chars[index])) {
                chars[index] = "-1";
                continue;
            }
            isPreFuhao = false;
            total += Integer.parseInt(chars[index]);
//            strings.set(index, String.valueOf(Integer.parseInt(strings.get(index)) - 1));
            chars[index] = String.valueOf(Integer.parseInt(chars[index]) - 1);
//            System.out.println(total+" "+ index +"  "+ chars[index]);
            if (goToLeft) {
                index--;
            } else {
                index++;
            }
        }
        System.out.println(total);
    }

}
