package temp0722;

/**
 * @author zjg
 * @ClassName ReverseLinkedListII
 * @Description TODO
 * @Date 2019/7/22 11:45
 **/
public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || n == m) {
            return head;
        }
        ListNode result = head;
        ListNode preHead = null;
        int index = 1;
        ListNode newHead = null;
        //首先判断是开头是1还是中间的值开始反转
        if (m == 1) {
            while (index++ <= n) {
                ListNode temp = head;
                head = head.next;
                temp.next = newHead;
                newHead = temp;
            }
            result = newHead;
        } else {
            //首先遍历到需要反转的节点
            while (index < m) {
                index++;
                preHead = head;
                head = head.next;
            }

            //开始翻转
            while (index++ <= n) {
                ListNode temp = head;
                head = head.next;
                temp.next = newHead;
                newHead = temp;
            }
            //反转后将翻转开始前的节点衔接上反转后的节点头
            if (preHead != null) {
                preHead.next = newHead;
            }
            newHead = preHead;
        }
        ListNode tempHead = result;
        if (newHead != null) {
            while (tempHead.next != null) {
                tempHead = tempHead.next;
            }
            tempHead.next = head;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode result = new ReverseLinkedListII().reverseBetween(node1, 1, 3);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}