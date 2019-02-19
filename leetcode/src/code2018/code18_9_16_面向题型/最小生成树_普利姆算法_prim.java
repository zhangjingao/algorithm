package code2018.code18_9_16_面向题型;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2018/11/28 15:00 </p>
 */
public class 最小生成树_普利姆算法_prim {
    static int[][] matrix;//邻接矩阵
    static int Max_Weight = Integer.MAX_VALUE;//表示不存在边的长度
    static int size = 100;//顶点个数

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int nodeNum = sca.nextInt();
        //邻接矩阵
        int[][] matrix = new int[size][size];
        //存放父节点的集合
        int[] fatherNode = new int[size];
        //初始化边
        for (int i = 1; i <= nodeNum; i++) {
            for (int j = 1; j <= nodeNum; j++) {
                int side = Integer.parseInt(sca.next());
                matrix[i][j] = side == 0 ? Max_Weight : side;
            }
        }

        for (int i = 0; i < fatherNode.length; i++) {
            System.out.printf(fatherNode[i]+" ");
        }

    }

    public void prim (int[][] matrix, int[] father, int nodeNum) {
        int[] sideValue = new int[size];
        int k = 0;
        int m;
        //第一个结点和其他节点的权值加入集合中
        for (int j = 1; j <= nodeNum; j++) {
            sideValue[j] = j == 1 ? 0 : matrix[1][j];
            //第一个结点没有父节点
            father[j] = 1;
        }
        for (int i = 2; i <= nodeNum; i++) {
            m = Max_Weight;
            for (int j = 1; j <= nodeNum; j++) {
                if (sideValue[j] <= m && sideValue[j] != 0) {
                    m = sideValue[j];
                    k = j;
                }
            }
            //将上面找到的结点放入到集合中
            sideValue[k] = 0;
            //更新父结点，将k结点与其他结点连接的最小权值放进sideValue[j]中
            for (int j = 1; j <= nodeNum; j++) {
                if (sideValue[j] > matrix[k][j] && sideValue[j] != 0) {
                    sideValue[j] = matrix[k][j];
                    father[j] = k;
                }
            }


        }

    }


}
