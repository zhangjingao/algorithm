package code18_10_9_6;

/**
 * @author zjg
 * <p> 2018/10/9 19:50 </p>
 */
public class ZigZagConversion_6 {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int index = 0;
        char [][] arr = new char[numRows][s.length()];
        int col = 0;
        int row = 0;
        while (index < s.length()) {
            while (row < numRows && index <s.length()) {
                arr[row++][col] = s.charAt(index++);
            }
            row--;
            while (row > 0 && index < s.length()) {
                arr[--row][++col] = s.charAt(index++);
            }
            row++;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0 ;i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
                if (arr[i][j] != '\u0000') {
                    result.append(arr[i][j]);
                }
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {
        new ZigZagConversion_6().convert("PAYPALISHIRING", 7);
    }


}
