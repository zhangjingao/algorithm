import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author zjg
 * <p> 2018/10/19 8:44 </p>
 */
public class TestSca {

    public static void main(String[] args) {
        //12345 两位数 12，13
        int [] arr = {1,2,3,44,5};
        List<int[]> lists = Arrays.asList(arr);
        int test = 100;
        sort(arr, test);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(test);
    }

    private static int sort(int[] arr, int test) {
        arr[0] = 1212121;
        test = 1;
        return test;
    }
}
