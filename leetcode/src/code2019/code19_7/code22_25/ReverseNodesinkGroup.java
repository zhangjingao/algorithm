package temp25;

import java.util.List;
import java.util.Stack;

/**
 * @author zjg
 * @ClassName ReverseNodesinkGroup
 * @Description TODO
 * @Date 2019/7/22 16:47
 **/
public class ReverseNodesinkGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        ListNode newListNode = new ListNode(0);
        ListNode result = newListNode;
        //用来在压入栈前存放链表，当链表长度不够时追加次链表
        ListNode tmp = null;
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        while (cur != null) {
            tmp = cur;
            //k个一组压入栈
            while (cur != null) {
                stack.push(cur.val);
                cur = cur.next;
                if (++index % k == 0) {
                    break;
                }
            }
            //如果有剩余链表，但是不是k的倍数
            if (cur == null && index % k != 0) {
                break;
            }
            while (!stack.empty()) {
                newListNode.next = new ListNode(stack.pop());
                newListNode = newListNode.next;
            }
            tmp = null;
        }
        newListNode.next = tmp;

        return result.next;
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
        ListNode result = new ReverseNodesinkGroup().reverseKGroup(node1, 6);
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