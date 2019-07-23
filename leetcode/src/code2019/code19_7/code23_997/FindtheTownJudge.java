package code23_997;

import java.util.Arrays;

/**
 * @author zjg
 * @ClassName FindtheTownJudge
 * @Description TODO
 * @Date 2019/7/23 15:43
 **/
public class FindtheTownJudge {

    public int findJudge(int N, int[][] trust) {
        //第一位代表被信任的次数，第二位代表第一个信任的人
        int[][] arr = new int[N + 1][2];
        for (int i = 0; i < trust.length; i++) {
            arr[trust[i][1]][0]++;
            arr[trust[i][0]][1] = trust[i][1];
        }
        for (int i = 1; i < N + 1; i++) {
            if (arr[i][0] == N - 1 && arr[i][1] == 0) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        //3
        //[[1,2],[2,3]]
        int[][] arr = {{1,3},{2,3},{3,1}};
        System.out.println(
                new FindtheTownJudge().findJudge(3, arr)
        );

    }

}
