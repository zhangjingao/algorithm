package 随笔.面试.面经.面经0412;

/**
 * @author zjg
 * <p> 2019/4/12 8:22 </p>
 */
public class Main_choose4 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int temp = 1000 + i * 100 + j * 10 + k;
                    char[] arr = String.valueOf(temp).toCharArray();
                    int countPlace2 = 0;
                    for (int l = 0; l < 4; l++) {
                        int place = 1;
                        for (int m = l+1; m < 4; m++) {
                            if (arr[l] == arr[m]) {
                                place++;
                            }
                        }
                        if (place == 2) {
                            countPlace2++;
                        } else if (place > 2) {
                            countPlace2 = 2;
                            break;
                        }
                    }
                    if (countPlace2 == 1) {
                        System.out.println(temp);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
