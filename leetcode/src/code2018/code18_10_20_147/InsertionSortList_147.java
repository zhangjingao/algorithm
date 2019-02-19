package code2018.code18_10_20_147;

/**
 * @author zjg
 * <p> 2018/10/20 8:57 </p>
 */
public class InsertionSortList_147 {

/*    public ListNode insertionSortList(ListNode head) {

        ListNode temp = head;
        while (temp != null) {
            ListNode listNode = temp;
            ListNode changeNode = head;
            if (temp.next != null) {
                ListNode listNodeNext = temp.next;
                while (listNodeNext != null) {
                    if (listNode.val < listNodeNext.val) {
                        break;
                    }
                    changeNode = listNodeNext;
                    listNodeNext = listNodeNext.next;
                }

            }
*//*
            System.out.println();
            System.out.println(listNode.val+" "+changeNode.val+" "+changeNode.next);
*//*
            ListNode tempNode = temp;
            tempNode.next = changeNode.next;
            changeNode.next = tempNode;

            System.out.println(temp.val+"--");

            temp = temp.next;

            ListNode tempHead = temp;
            while (tempHead !=null) {
                System.out.print(tempHead.val+" ");
                tempHead = tempHead.next;
            }

        }
        return null;
    }*/


    public ListNode insertionSortList(ListNode head) {
        ListNode tempNode = new ListNode(0);

        ListNode change = null;
        while (head != null) {
            change = head;
            ListNode headNode = head.next;
            while (headNode != null) {
                if (change.val > headNode.val) {
                    change = headNode;
                }
                headNode = headNode.next;
            }
            head = head.next;
//            System.out.println("val "+change.val);
            tempNode.next = change;
        }

        ListNode tempHead = tempNode;
        while (tempHead !=null) {
            System.out.print(tempHead.val+" ");
            tempHead = tempHead.next;
        }


        return null;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(1);
        ListNode listNode4 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        new InsertionSortList_147().insertionSortList(listNode1);
    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}