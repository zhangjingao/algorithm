/**
 * @author zjg
 * <p> 2018/10/9 20:54 </p>
 */
public class TestYanghui {


    public static void main(String[] args) {
        char [][] arr = new char[5][5];
        int col = 0;
        int row = 0;

        for (int i = 0 ;i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"-");
            }
            System.out.println();
        }


        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 'P';
        }

        for (int i = 0 ;i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
    }

}
