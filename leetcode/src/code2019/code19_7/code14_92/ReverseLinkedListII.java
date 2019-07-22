package code2019.code19_7.code14_92;

/**
 * @author zjg
 * <p> 2019/7/14 19:27 </p>
 */
public class ReverseLinkedListII {

    // 1->2->3->4->5->null m=2,n=4
    // 1->4->3->2->5->null

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n)
            return head;
        ListNode normal = head, last = null, pre, cur, gra = new ListNode(0);
        gra.next = head;
        pre = gra;
        cur = head;
        while (cur != null) {
            if (m == 1) {
                normal = cur;
                // 链表反转,头拼接
                last = reverseList(cur, pre, n);
                // 尾拼接
                normal.next = last;
                break;
            }
            cur = cur.next;
            pre = pre.next;
            m--;
            n--;
        }
        return gra.next;
    }

    // 反转链表工具方法,反转当前节点与之后n个节点的子链表,头拼接
    public ListNode reverseList(ListNode head, ListNode first, int n) {
        ListNode pre = null;
        ListNode next = head;
        while (n > 0) {
            ListNode tmp = next.next;
            next.next = pre;
            pre = next;
            next = tmp;
            n--;
        }
        first.next = pre;
        return next;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode node = new ReverseLinkedListII().reverseBetween(node1, 2, 4);
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
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