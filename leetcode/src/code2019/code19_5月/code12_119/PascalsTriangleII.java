package code2019.code19_5月.code12_119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/5/12 7:55 </p>
 */
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> now = new ArrayList<>(rowIndex);
        for (int i = 0; i < rowIndex; i++) {
            now.add(1);
        }
        int[] last = new int[rowIndex];
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = 1; j < i; j++) {
                int newResult = now.get(j) + last[j - 1];
                now.set(j, newResult);
                last[j - 1] = now.get(j - 1);
            }
        }
        return now;
    }

    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int rowIndex = Integer.parseInt(line);

            List<Integer> ret = new PascalsTriangleII().getRow(rowIndex);

            String out = integerArrayListToString(ret);

            System.out.print(out);
        }
    }

}
