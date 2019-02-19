package code2018.code18_11_5_401;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * <p> 2018/11/6 21:46 </p>
 */
public class BinaryWatch_401 {

    public List<String> readBinaryWatch(int num) {
        int[][] numTime = {{0,1},{1,2},{2,4},{3,8},
                {4,1},{5,2},{6,4},{7,8},{8,16},{9,32}};
        List<String> result = new ArrayList<>();
        sort(num, numTime, 0, "", result);
        return result;
    }

    public void sort (int endNum, int[][] numTime, int index, String path, List<String> result) {
        if (endNum == path.length()) {
            int hour = 0;
            int minture = 0;
            char[] time = path.toCharArray();
            for (int i = 0; i < time.length; i++) {
                int timeTmp = time[i] - '0';
                if (timeTmp < 4) {
                    hour += numTime[timeTmp][1];
                } else {
                    minture += numTime[timeTmp][1];
                }
            }
            String timeResult = "";
            if (hour >= 12 ) {
                return;
            }  else if (minture >= 60) {
                return;
            } else {
                timeResult = hour + ":";
                timeResult += minture >= 10 ? minture + "" : 0 + "" + minture;
            }
            result.add(timeResult);
        }  else {

            for (int i = index; i < numTime.length; i++) {
                sort(endNum, numTime, i+1, path+""+ i, result);
            }

        }

    }


    public static void main(String[] args) {
        System.out.println(
                new BinaryWatch_401().readBinaryWatch(2)
        );
    }

}
