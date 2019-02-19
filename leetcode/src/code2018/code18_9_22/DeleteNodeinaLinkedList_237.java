package code2018.code18_9_22;

/**
 * @author zjg
 * <p> 2018/9/22 16:59 </p>
 */
public class DeleteNodeinaLinkedList_237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}