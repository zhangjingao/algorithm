package code2019.code19_5月.code27_1019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author zjg
 * <p> 2019/5/27 8:58 </p>
 */
public class NextGreaterNodeInLinkedList {

    public int[] nextLargerNodes(ListNode head) {
        int[] arr =  new int[10000];
        int index = 0;
        ListNode temp;
        while (head != null) {
            int value = head.val;
            int minValue = 0;
            temp = head.next;
            while (temp != null) {
                if (temp.val > value) {
                    minValue = temp.val;
                    break;
                }
                temp = temp.next;
            }
            arr[index++] = minValue;
            head = head.next;
        }
        return Arrays.copyOf(arr, index);
    }

}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }