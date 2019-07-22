package 基础练习;/*
package 基础练习;

import java.util.Arrays;
import java.util.Scanner;

*/
/**
 * @author zjg
 * <p> 2019/3/16 17:22 </p>
 *//*

public class 皇后问题2n {

    static int sum = 0;

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sca.nextInt();
            }
        }
        sca.close();
        //第一行列号
        for (int i = 0; i < n; i++) {
            if (arr[0][i] != 0) {
                int[][] temp = clone(arr, n);
                temp[0][i] = 2;     //2表示这个位置已经放了
                //默认该列可以
                judge(temp, 1, n);
            }
        }
        System.out.println(sum);
        int cn2 = (sum * (sum -1))/2;
        System.out.println(2 * cn2);
    }

    //判断该行是否可以放
    private static void judge(int[][] temp, int row, int n) {
        if (row == n) {
            for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(temp[i]));
            }
            System.out.println("------");
            sum++;
        } else {
            for (int i = 0; i < n; i++) {
                if (temp[row][i] != 0) {
                    int tempRow = row;
                    boolean boo = true;
                    while (--tempRow >= 0) {
                        for (int j = 0; j < n; j++) {
                            if (temp[tempRow][j] == 2) {
                                //如果列相同，或者在一条对角线上
                                if (i == j || Math.abs(row - tempRow) == Math.abs(j - i)) {
                                    boo = false;
                                    break;
                                }
                            }
                        }
                        if (!boo) {
                            break;
                        }
                    }
                    if (boo) {
                        int[][] temp2 = clone(temp, n);
                        temp2[row][i] = 2;
                        judge(temp2, row + 1, n);
                    }
                }

            }
        }
    }


    protected static int[][] clone (int[][] arr, int n) {
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.arraycopy(arr[i], 0, temp[i], 0, n);
        }
        return temp;
    }


}
*/

import java.util.Scanner;

public class 皇后问题2n {

    private static int result = 0;


    public static boolean isSafety(short[][] chess, int row, int x, int queen) {

        if (row != 0 && x != 0 && x != chess.length - 1) {

            int step=1,step2=1;
            while(row-step>=0&&x+step<=chess.length-1){
                if(chess[row-step][x+step]==queen){
                    return false;
                }
                step++;
            }
            while(row-step2>=0&&x-step2>=0){
                if(chess[row-step2][x-step2]==queen){
                    return false;
                }
                step2++;
            }
        }

        if (row != 0 && x == 0) {
            int step=1;
            while(row-step>=0&&x+step<=chess.length-1){
                if(chess[row-step][x+step]==queen){
                    return false;
                }
                step++;
            }
        }

        if (row != 0 && x == chess.length-1) {
            int step=1;
            while(row-step>=0&&x-step>=0){
                if(chess[row-step][x-step]==queen){
                    return false;
                }
                step++;
            }
        }

        for (int i = 0; i < row; i++) {
            if (chess[i][x] == queen) {
                return false;
            }
        }

        return true;
    }

    public static void putQueen(short[][] chess, int row) {

        // 摆完一盘
        if (row == chess.length) {
            if(queenNumber(chess)){
                result++;
            }
            return;
        }

        for (int i = 0; i < chess.length; i++) {
            //清除原本的摆放记录
            for (int j = 0; j < chess.length; j++) {
                if(chess[row][j]!=0){
                    chess[row][j] = 1;
                }
            }

            if (isSafety(chess, row, i, 6)&&chess[row][i]==1) {
                //摆放白皇后
                chess[row][i] = 6;

                for (int k = 0; k < chess.length; k++) {
                    //清除原本的摆放记录
                    for (int l = 0; l < chess.length; l++) {
                        if (chess[row][l] != 0 && l != i) {
                            chess[row][l] = 1;
                        }
                    }

                    if (isSafety(chess, row, k, 9)&&chess[row][k]==1&&k != i) {
                        //摆放黑皇后
                        chess[row][k]=9;
                        //摆放下一行
                        putQueen(chess, row + 1);

                    }
                }
            }
        }

    }

    public static boolean queenNumber(short[][] chess){
        int white=0,black=0;
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess.length;j++){
                if(chess[i][j]==6){
                    white++;
                }
                if(chess[i][j]==9){
                    black++;
                }

            }
        }
        if(white==chess.length&&black==chess.length){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        short[][] chess = new short[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chess[i][j] = (short) console.nextInt();
            }
        }

        putQueen(chess, 0);
        System.out.println(result);

    }
}