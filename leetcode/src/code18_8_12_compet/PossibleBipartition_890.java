package code18_8_12_compet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * @date 2018/8/12 9:19
 * @Description
 */
public class PossibleBipartition_890 {

    public boolean possibleBipartition(int N, int[][] dislikes) {



        return true;
    }

    private List<Integer> resolve (int N, int [][] dislikes) {

        for (int i = 1; i <= N; i++) {
            List<Integer> dislikepeople = dislike(i,dislikes); //这个人讨厌的所有用户
            for (int dislike : dislikepeople) { //拿着他讨厌的人判断：他讨厌的人讨厌的人是否和他一样
                List<Integer> dislikeDislike = dislike(dislike,dislikes);

                for (int d : dislikeDislike) {
                    if (dislikepeople.contains(d)) {
                        return null;
                    }
                }
            }
        }

        return null;
    }

    private List<Integer> dislike (int people, int[][] dislike) {
        List<Integer> peopledislike = new ArrayList<>();
        for (int[] arr : dislike) {
            if (people == arr[0]) {
                peopledislike.add(arr[1]);
            }
        }
        return peopledislike;
    }

    public static void main(String[] args) {
        System.out.println(
                new PossibleBipartition_890().possibleBipartition(5,new int[][]{{1,2},{2,3},{3,4},{4,5},{1,5}})
        );
    }

}
