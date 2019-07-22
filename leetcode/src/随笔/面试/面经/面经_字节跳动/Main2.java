package 随笔.面试.面经.面经_字节跳动;

import java.util.*;

/**
 * @author zjg
 * <p> 2019/2/28 22:35 </p>
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int c = sca.nextInt();
        int[] arrColor = new int[c+1];//用来记录上一个颜色出现的行数
        int firstColorCount = sca.nextInt();
        List<Integer> firstColors = new ArrayList<>(firstColorCount);
        Set<Integer> cantColor = new HashSet<>();
        for (int i = 0; i < firstColorCount; i++) {
            int color = sca.nextInt();
            firstColors.add(color);
            arrColor[color] = 1;
        }
        for (int i = 1; i < n; i++) {
            int colors = sca.nextInt();
            for (int j = 0; j < colors; j++) {
                int color = sca.nextInt();
                if ((i + 1) -  arrColor[color] <= m - 1) {
                    cantColor.add(color);
                }
                arrColor[color] = i + 1;
            }
        }
        if (m == 2) {
            for (int i = 1; i < c + 1; i++) {
                if (arrColor[i] == n && firstColors.contains(i)) {
                    cantColor.add(i);
                }
            }
        }
        System.out.println(cantColor.size());
    }

}
