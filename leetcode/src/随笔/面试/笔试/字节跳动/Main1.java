package 随笔.面试.笔试.字节跳动;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author zjg
 * <p> 2019/4/14 10:01 </p>
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        List<String[]> arr = new ArrayList<>();
        String temp;
        /*while (!(temp = sca.nextLine()).equals("")) {
            String[] arrTemp = temp.split(" ");
            arr.add(arrTemp);
        }*/
        while (sca.hasNextLine()) {
            temp = sca.nextLine();
            String[] arrTemp = temp.split(" ");
            arr.add(arrTemp);
        }
        int time = 0;
        time = work(arr, time);
        for (String[] arrTemp : arr) {
            for (String anArrTemp : arrTemp) {
                if (anArrTemp.equals("1")) {
                    System.out.println("-1");
                    return;
                }
            }
        }
        System.out.println(time);
    }

    private static int work(List<String[]> arr, int time) {
        Map<Integer, Integer> chengxuyuanLoca = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            String[] arrTemp = arr.get(i);
            for (int j = 0; j < arrTemp.length; j++) {
                if (arrTemp[j].equals("2")) {
                    //判断四周有木有产品经理，有就准备处理他，没有就不管
                    //左边
                    if (j > 0) {
                        if (arrTemp[j-1].equals("1")) {
                            chengxuyuanLoca.put(i,j);
                            continue;
                        }
                    }
                    //右边
                    if (j < arrTemp.length-1) {
                        if (arrTemp[j+1].equals("1")) {
                            chengxuyuanLoca.put(i,j);
                            continue;
                        }
                    }
                    //上面
                    if (i > 0) {
                        if (arr.get(i-1)[j].equals("1")) {
                            chengxuyuanLoca.put(i,j);
                            continue;
                        }
                    }
                    //下面
                    if (i < arr.size()-1) {
                        if (arr.get(i+1)[j].equals("1")) {
                            chengxuyuanLoca.put(i,j);
                        }
                    }
                }
            }
        }
        if (chengxuyuanLoca.size() == 0) {
            return time;
        } else {
            //将产品经理改为程序员
            change(arr, chengxuyuanLoca);
            return work(arr, time+1);
        }
    }

    private static void change(List<String[]> arr, Map<Integer, Integer> chengxuyuanLoca) {
        for (Map.Entry<Integer, Integer>  c: chengxuyuanLoca.entrySet() ) {
            int row = c.getKey();
            int col = c.getValue();
            if (col > 0) {
                if (arr.get(row)[col - 1].equals("1")) {
                    arr.get(row)[col - 1] = "2";
                }
            }
            //右边
            if (col < arr.get(row).length-1) {
                if (arr.get(row)[col + 1].equals("1")) {
                    arr.get(row)[col + 1] = "2";
                }
            }
            //上面
            if (row > 0) {
                if (arr.get(row-1)[col].equals("1")) {
                    arr.get(row - 1)[col] = "2";
                }
            }
            //下面
            if (row < arr.size()-1) {
                if (arr.get(row+1)[col].equals("1")) {
                    arr.get(row + 1)[col] = "2";
                }
            }
        }

    }

}
