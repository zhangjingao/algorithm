package code2019.code19_5月.code9_328;

/**
 * @author zjg
 * <p> 2019/5/9 19:58 </p>
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode listNodeHead1 = head;
        ListNode listNodeEnd1 = null;
        ListNode listNodeHead2 = null;
        ListNode listNodeEnd2 = null;

        int index = 1; //当前进行的下标
        while (head.next != null) {
            head = head.next;
            index++;
            if (index % 2 == 0) {
                if (listNodeHead2 == null) {
                    listNodeHead2 = new ListNode(head.val);
                } else if (listNodeEnd2 == null) {
                    listNodeEnd2 = new ListNode(head.val);
                    listNodeHead2.next = listNodeEnd2;
                } else {
                    listNodeEnd2.next = new ListNode(head.val);
                    listNodeEnd2 = listNodeEnd2.next;
                }
            } else {
                if (listNodeEnd1 == null) {
                    listNodeEnd1 = new ListNode(head.val);
                    listNodeHead1.next = listNodeEnd1;
                } else {
                    listNodeEnd1.next = new ListNode(head.val);
                    listNodeEnd1 = listNodeEnd1.next;
                }
            }
        }
        if (listNodeEnd1 == null) {
            listNodeEnd1 = listNodeHead1;
        }
        listNodeEnd1.next = listNodeHead2;
        return listNodeHead1;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        ListNode listNode6 = new ListNode(6);
        ListNode listNode7 = new ListNode(7);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;


        ListNode result = new OddEvenLinkedList().oddEvenList(listNode1);
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