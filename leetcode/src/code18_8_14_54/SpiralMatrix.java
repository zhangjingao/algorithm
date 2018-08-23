package code18_8_14_54;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * @date 2018/8/14 20:18
 * @Description
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new ArrayList<>();
        }

        int hight = matrix.length;
        int width = matrix[0].length;
        List<Integer> list = new ArrayList<>(width*hight);

        int m = 0; //当前横坐标
        int n = 0; //当前纵坐标
        while (hight > 0 && width > 0) {

            //如果是只有一行或一列
            if (width == 1) {
                for (int i = 0; i < hight; i++) {
                    list.add(matrix[n++][m]);
                }
                return list;
            } else if (hight == 1) {
                for (int i = 0; i < width; i++) {
                    list.add(matrix[n][m++]);
                }
                return list;
            }
            //向右
            for (int i = 0; i < width-1; i++)
                list.add(matrix[m][n++]);
            //向下
            for (int i = 0; i < hight-1; i++)
                list.add(matrix[m++][n]);
            //向左
            for (int i = 0; i < width-1; i++)
                list.add(matrix[m][n--]);
            //向上
            for (int i = 0; i < hight-1; i++)
                list.add(matrix[m--][n]);

            m++;
            n++;
            width -= 2;
            hight -=2;
        }
        return list;
    }

    public static void main(String[] args) {
        int [][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List list = new SpiralMatrix().spiralOrder(arr);
        list.forEach(l->{
            System.out.print(l+" ");
        });
    }

}
