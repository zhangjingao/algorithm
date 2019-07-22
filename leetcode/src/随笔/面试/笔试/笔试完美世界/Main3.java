package 随笔.面试.笔试.笔试完美世界;

import java.util.Scanner;

/**
 * @author zjg
 * <p> 2019/4/14 10:01 </p>
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n =  sca.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sca.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sca.nextInt();
        }
        int time = sca.nextInt();
        //存放每个题的分数占比
        int[] scoreBaiFen = new int[n];
        for (int i = 0; i < n; i++) {
            scoreBaiFen[i] = arr1[i] / arr2[i];
        }
        //按占比从大到小做题
        int sum = 0;
        int timeTemp = time;
        while (time > 0) {
            int maxIndex = 0;
            int maxValue = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (scoreBaiFen[i] > 0 && scoreBaiFen[i] > maxValue) {
                    maxIndex = i;
                    maxValue = scoreBaiFen[i];
                    scoreBaiFen[i] = -1;
                }
            }

            if (time < arr2[maxIndex]) {
                break;
            } else {
                time -= arr2[maxIndex];
                sum += arr1[maxIndex];
            }
        }
        if (time > 0) {
            int minTime = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int i = 0; i < n; i++) {
                if (scoreBaiFen[i] != -1 && arr2[i] < minTime) {
                    minTime = arr2[i];
                    minIndex = i;
                }
            }
            if (time > minTime) {
                time -= minTime;
                sum += minIndex;
            }
        }

        //按时间来定
        int sum2 = 0;
        while (timeTemp > 0) {
            int minTime = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int i = 0; i < n; i++) {
                if (arr2[i] > 0 && arr2[i] < minTime) {
                    minIndex = i;
                    minTime = arr2[i];
                }
            }
            if (timeTemp >= minTime) {
                timeTemp -= minTime;
                sum2 += arr1[minIndex];
                arr2[minIndex] = 0;
            } else {
                break;
            }

        }
        System.out.println(sum+" "+sum2);
        if (sum2 > sum) {
            sum = sum2;
        }

        System.out.println(sum);
    }


}


