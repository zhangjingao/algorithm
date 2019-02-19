package code2018.code18_8_5_compet;

import java.util.Arrays;

/**
 * @author zjg
 * @date 2018/8/5 10:32
 * @Description
 */
public class 救生艇 {

    public int numRescueBoats(int[] people, int limit) {
        if (people.length == 0) {
            return 0;
        }
        Arrays.sort(people);
        int [] arr = new int[people.length];
        int [] weight = new int[people.length];//船上承载的值
        arr[0] = 1;
        weight[0] = people[0];
        for (int i = 1; i < arr.length; i++) {
            /*for (int j = i-1; j >= 0; i--) {
                if (weight[i - 1] == limit) {
                    arr[i] = arr[i - 1] + 1;
                    weight[i] = people[i];
                }
            }*/
                if (weight[i - 1] == limit) {
                    arr[i] = arr[i - 1] + 1;
                    weight[i] = people[i];
                } else if (people[i] + weight[i - 1] <= limit) {
                    arr[i] = arr[i - 1];
                    weight[i] = people[i] + weight[i - 1];
                } else {
                    arr[i] = arr[i - 1] + 1;
                    weight[i] = people[i];
                }

        }

        return arr[people.length-1];
    }

    /*public int numRescueBoats(int[] people, int limit) {
        if (people.length == 0) {
            return 0;
        }
        Arrays.sort(people);
        int [] arr = new int[people.length];
        int [] weight = new int[people.length];//船上承载的值
        arr[0] = 1;
        weight[0] = people[0];
        return 0;
    }*/

    /*private void judge (int start, int end, int limit, int[] people, int[] arr, int[] weight) {

        if (people[start] + people[end] <= limit) {

        }
        for (int i = start; i < (end+start)/2; i++) {
            for (int j = end; j >= (end+start)/2; j-- ) {
                if () {

                }
            }
        }
    }*/

    public static void main(String[] args) {
        //int arr[] = {3,8,7,1,4};
        int arr[] = {5,1,4,2};
        int num = new 救生艇().numRescueBoats(arr,6);
        System.out.println(num);
    }
}
