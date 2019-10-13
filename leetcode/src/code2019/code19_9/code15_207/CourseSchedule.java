package code2019.code19_9.code15_207;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zjg
 * @ClassName CourseSchedule
 * @Description TODO
 * @Date 2019/9/15 15:21
 **/
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] isInPath = new int[numCourses];
        work(prerequisites, isInPath, numCourses);
        for (int value : isInPath) {
            System.out.println(value);
            if (value == 0) {
//                return false;
            }
        }
        return true;
    }

    private void work(int[][] prerequisites, int[] isInPath, int len) {
        for (int i = 0; i < len; i++) {
            boolean isRoot = true;
            for (int[] prerequisite : prerequisites) {
                if (prerequisite[0] == i) {
                    isRoot = false;
                    break;
                }
            }
            if (isRoot && isInPath[i] == 0) {
                isInPath[i] = 1;
                dfs(prerequisites, isInPath, i);
            }
        }
    }

    private void dfs(int[][] prerequisites, int[] isInPath, int index) {
        List<Integer> roots = new ArrayList<>();
        for (int i = 0; i < prerequisites.length; i++) {
            if (prerequisites[i][1] == index) {
                //再判断是否只剩需要index这门课
                boolean boo = true;
                int tmp = prerequisites[i][0];
                for (int j = 0; j < prerequisites.length; j++) {
                    if (prerequisites[j][0] == prerequisites[i][0] && prerequisites[j][1] != index) {
                        boo = false;
                    }
                    if (prerequisites[j][0] == prerequisites[i][0] && prerequisites[j][1] == index) {
                        prerequisites[i][0] = -1;
                        prerequisites[i][1] = -1;
                    }
                }
//                System.out.println(tmp +"  " + index+" "+boo);
                if (boo && isInPath[tmp] == 0) {
                    isInPath[tmp] = 1;
                    roots.add(tmp);
                }
            }
        }
        if (roots.size() > 0) {
            roots.forEach(elem->{
                dfs(prerequisites, isInPath, elem);
            });
        }

    }


    public static void main(String[] args) {
        System.out.println(
                new CourseSchedule().canFinish(3, new int[][]{{0,1},{0,2},{1,2}})
        );
    }

}
