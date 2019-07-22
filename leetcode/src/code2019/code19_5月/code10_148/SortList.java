package code2019.code19_5月.code10_148;

import java.util.Arrays;
/**
 * @author zjg
 * <p> 2019/5/10 8:46 </p>
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int size = 0;
        ListNode node = head;
        while (head != null) {
            size++;
            head = head.next;
        }
        int[] arr = new int[size];
        int index = 0;
        while (node != null) {
            arr[index++] = node.val;
            node = node.next;
        }

        Arrays.sort(arr);

        ListNode listNode = new ListNode(arr[0]);
        ListNode temp = listNode;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
//        listNode.next = temp;
        return listNode;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        ListNode listNode = new SortList().sortList(listNode1);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }



    }


}
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}