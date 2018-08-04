package 知识点;

/**
 * @author zjg
 * @date 2018/5/24 19:47
 * @Description
 */
public class 插入排序 {

    public static void main(String[] args) {
        int [] arr = {1,2,4,7,3,9,6};

        for (int i = 0; i < arr.length; i++) {
            int temp = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[temp]) {
                    temp = j;
                }
            }
            int tempValue = arr[temp];
            arr[temp] = arr[i];
            arr[i] = tempValue;
        }
        for (int a : arr) {
            System.out.print(a+" ");
        }
    }
}
