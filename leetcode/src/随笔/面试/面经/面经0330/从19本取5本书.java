package 随笔.面试.面经.面经0330;

/**
 * @author zjg
 * <p> 2019/3/30 15:01 </p>
 */
public class 从19本取5本书 {

    static int count = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            for (int j = i+2; j < 13; j++) {
                for (int k = j+2; k < 15; k++) {
                    for (int l = k+2; l < 17; l++) {
                        for (int m = l+2; m < 19; m++) {
                            count++;
                        }
                    }
                    
                }
                
            }
        }
        System.out.println(count);
    }

}
