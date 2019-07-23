package code23_19;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zjg
 * @ClassName RemoveNthNodeFromEndofList
 * @Description TODO
 * @Date 2019/7/23 9:15
 **/
public class RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || (head.next == null && n == 1)) {
            return null;
        }
        List<ListNode> listNodes = new ArrayList<>();
        int index = 1;
        while (head != null) {
            listNodes.add(head);
            head = head.next;
            index++;
        }
        int cur = index - 1 - n - 1;
        ListNode tmp;
        if (cur == -1) {
            return listNodes.get(0).next;
        } else {
            tmp = listNodes.get(cur);
        }
        if (n == 1) {
            tmp.next = null;
        } else {
            tmp.next = tmp.next.next;
        }
        return listNodes.get(0);
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
        ListNode result = new RemoveNthNodeFromEndofList().removeNthFromEnd(node1, 2);
        while (result != null) {
            System.out.print(result.val+" ");
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