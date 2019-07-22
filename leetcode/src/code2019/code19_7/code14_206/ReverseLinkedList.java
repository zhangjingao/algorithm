package code2019.code19_7.code14_206;

/**
 * @author zjg
 * <p> 2019/7/14 15:32 </p>
 */
public class ReverseLinkedList {

    ListNode result = null;
    ListNode temp = null;

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        getResult(head);
        return result;
    }

    public ListNode getResult(ListNode head) {
        if (head.next == null) {
            result = new ListNode(head.val);
            return result;
        }
        temp = getResult(head.next);
        temp.next = new ListNode(head.val);
        return temp.next;
    }


}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}