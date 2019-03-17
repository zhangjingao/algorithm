package lanqiao2019;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/3/7 21:55 </p>
 */
public class 回形取数 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int m = sca.nextInt();
        int n = sca.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sca.nextInt();
            }
        }
        sca.close();
        int count = 0;
        int i = 0, j = 0;
        while (count < m * n) {
            while (i < m && arr[i][j] != 0) {
                System.out.print(arr[i][j]+" ");
                arr[i++][j] = 0;
                count++;
            }
            i--;
            j++;
            while (j < n && arr[i][j] != 0) {
                System.out.print(arr[i][j]+" ");
                arr[i][j++] = 0;
                count++;
            }
            j--;
            i--;
            while (i >= 0 && arr[i][j] != 0) {
                System.out.print(arr[i][j]+" ");
                arr[i--][j] = 0;
                count++;
            }
            i++;
            j--;
            while (j >= 0 && arr[i][j] != 0) {
                System.out.print(arr[i][j]+" ");
                arr[i][j--] = 0;
                count++;
            }
            j++;
            i++;
        }

    }

}
