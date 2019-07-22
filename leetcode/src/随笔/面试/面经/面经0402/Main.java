package 随笔.面试.面经.面经0402;

import java.util.Scanner;



/**
 * @author zjg
 * <p> 2019/4/1 11:44 </p>
 */
public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int m = sca.nextInt();
        int[][] jobs = new int[n][2];
        int[] friends = new int[m];
        for (int i = 0; i < n; i++) {
            jobs[i][0] = sca.nextInt();
            jobs[i][1] = sca.nextInt();
        }
        for (int i = 0; i < m; i++) {
            friends[i] = sca.nextInt();
        }
        sortJobs(jobs);

        System.out.println("--");
        for (int i = 0; i < m; i++) {
            int ability = friends[i];
            int j = 0;
            for (; j < n; j++) {
                if (ability < jobs[j][0]) {
                    break;
                }
            }
            System.out.println(jobs[j-1][1]);
        }
    }

    private static void sortJobs(int[][] jobs) {
        int len = jobs.length;
        for (int i = 0; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (jobs[j][0] < jobs[min][0]) {
                    min = j;
                }
            }
            int[] temp = jobs[i];
            jobs[i] = jobs[min];
            jobs[min] = temp;
        }
    }

}