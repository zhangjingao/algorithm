package code18_9_16_面向题型;

import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2018/11/28 15:00 </p>
 */
public class 最小生成树_普利姆算法_prim_2 {


    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("输入顶点数：");
        int nodeNum = sca.nextInt();
        System.out.println("输入边数：");
        int sideNum = sca.nextInt();

        int[] total = new int[nodeNum];
        for (int i = 0; i < nodeNum; i++) {
            total[i] = i+1;
        }

        int[][] martix = new int[nodeNum][nodeNum];
        for (int i = 0; i < sideNum; i++) {
            System.out.println("输入边（格式：结点号 结点号 权值）：");
            int side1 = sca.nextInt();
            int side2 = sca.nextInt();
            int value = sca.nextInt();
            martix[side1-1][side2-1] = value;
            martix[side2-1][side1-1] = value;
        }

        for (int i = 0; i < nodeNum; i++) {
            for (int j = 0; j < nodeNum; j++) {
                System.out.print(martix[i][j]+" ");
            }
            System.out.println();
        }

    }

    public void prim (int[][] maritx, int nodeNum) {
        int size = 100;


    }


}

