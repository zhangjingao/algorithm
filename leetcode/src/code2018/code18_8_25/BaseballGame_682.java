package code2018.code18_8_25;

/**
 * @author zjg
 * <p> 2018/8/25 15:12 </p>
 */
public class BaseballGame_682 {

    public int calPoints(String[] ops) {
        int len = ops.length;
        //二维数组，数组1：有效分数，数组2：总分
        int [][] arr = new int[len][2];
        for (int i = 0; i < len; i++) {

            if ("+".equals(ops[i])) {
                int num = 0;
                for (int j = i-1; j >= 0; j--) {
                    if (arr[j][0] != 0 && num < 2) {
                        num++;
                        arr[i][0] += arr[j][0];
                        if (num == 1) {
                            arr[i][1] += arr[j][1];
                        }
                    }
                }
                arr[i][1] += arr[i][0];
            } else if ("D".equals(ops[i])) {
                int num = 0;
                for (int j = i-1; j >= 0; j--) {
                    if (arr[j][0] != 0 && num < 1) {
                        num++;
                        arr[i][0] += arr[j][0]*2;
                        arr[i][1] += arr[j][1];
                    }
                }
                arr[i][1] += arr[i][0];
            } else if ("C".equals(ops[i])) {
                int num = 0;
                for (int j = i-1; j >= 0; j--) {
                    if (arr[j][0] != 0 && num < 1) {
                        num++;
                        arr[i][1] = arr[j][1] - arr[j][0];
                        arr[j][0] = 0;
                    }
                }
            } else {
                arr[i][0] = Integer.parseInt(ops[i]);
                int num = 0;
                for (int j = i-1; j >= 0 && num < 1; j--) {
                    if (arr[j][0] != 0) {
                        num++;
                        arr[i][1] += arr[j][1];
                    }
                }
                arr[i][1] += arr[i][0];
            }
        }

        return arr[len-1][1];
    }

    public static void main(String[] args) {
        String[] str = {"5","-2","4","C","D","9","+","+"};
        System.out.println(
                new BaseballGame_682().calPoints(str)
        );
    }

}
