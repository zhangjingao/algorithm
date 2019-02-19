package code2019.code19_2_15_96_________;

/**
 * @author zjg
 * <p> 2019/2/15 20:29 </p>
 */
public class UniqueBinarySearchTrees {

    public int numTrees(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int sum = 2;
        int index = 3;
        while (index <= n) {
            sum += index++;
        }
        return sum;
    }
}
