package code2019.code19_5月.code13_638;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/5/13 22:03 </p>
 */
public class ShoppingOffers {

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int min = 0;
        int len = special.size();
        boolean haveElem = false;
        for (int i = 0; i < needs.size(); i++) {
            min += needs.get(i) * price.get(i);
            if (needs.get(i) != 0) {
                haveElem = true;
//                break;
            }
        }
        System.out.println(min);
        if (!haveElem) {
            return 0;
        } else {
            for (int i = 0; i < len; i++) {
                int tempSum = 0;
                List<Integer> list = special.get(i);
                tempSum += list.get(needs.size());
                if (tempSum >= min) {
                    continue;
                }
                //证明是否超出需要，true代表不超出
                boolean boo = true;
                for (int j = 0; j < needs.size(); j++) {
                    int have = list.get(j);
                    int need = needs.get(j);
                    if (have > need) {
                        boo = false;
                        break;
                    } else {
                        tempSum += price.get(j) * (need - have);
                    }
                }
                if (boo && tempSum < min) {
                    min = tempSum;
                }
                System.out.println(tempSum+" "+min);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        LinkedList nu;
    }

}
