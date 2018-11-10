package code_beauty_of_programming;

/**
 * @author zjg
 * <p> 2018/10/18 11:23 </p>
 */
public class 象棋将帅问题 {

    public static void main(String[] args) {
        int address[][] = new int[6][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < address[0].length; j++) {
                //A的循环结束
                for (int k = 0; k < 3; k++) {
                    for (int s = 0; s < address[0].length; s++) {
                        if (j == s) {
                            continue;
                        }
                        System.out.print("[("+((char)(i+100))+(j+8)+" )-("+((char)(s+100))+k+")] ");
                    }
                }
                System.out.println();
            }
        }
    }

}
