package code2019.code19_9.code15_134;

/**
 * @author zjg
 * @ClassName GasStation
 * @Description TODO
 * @Date 2019/9/15 14:46
 **/
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] >= cost[i]) {
                if (work(i, gas, cost)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private boolean work(int index, int[] gas, int[] cost) {
        int total = gas[index] - cost[index];
        int start = index;
        boolean boo = false;
        while (!boo ||start != index) {
            int next = start + 1 >= gas.length ? 0 : start + 1;
            if (total + gas[next] < cost[next]) {
                return false;
            }
            start++;
            total = total + gas[next] - cost[next];
            if (start >= gas.length) {
                start = 0;
            }
            boo = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(
                new GasStation().canCompleteCircuit(new int[]{3,1,1}, new int[]{1,2,2})
        );
    }

}
