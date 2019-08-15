package code2019.code19_8.code9_21;


import java.util.List;

/**
 * @author zjg
 * @ClassName MergeTwoSortedLists
 * @Description TODO
 * @Date 2019/8/9 17:02
 **/
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode result = new ListNode(0);
        ListNode resultTmp = result;
        while (l1 != null) {
            if (l2 == null) {
                resultTmp.next = l1;
                break;
            }
            if (l1.val < l2.val) {
                resultTmp.next = l1;
                l1 = l1.next;
            } else {
                resultTmp.next = l2;
                l2 = l2.next;
            }
            resultTmp = resultTmp.next;
        }
        if (l2 !=  null) {
            resultTmp.next = l2;
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(3);
        l1.next = l12;
        l12.next = l13;

        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(3);
//        ListNode l23 = new ListNode(4);
        l2.next = l22;
//        l22.next = l23;

        ListNode result = new MergeTwoSortedLists().mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

}
class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { this.val = x; }
}