package code18_7_8;

import java.util.Scanner;

/**
 * @author zjg
 * @date 2018/7/8 19:44
 * @Description You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(-1);
        //记录进位
        int overTen = 0;
        int l1Num, l2Num;
        //中间链表
        ListNode listNodeTmp;
        l1Num = l1.val;
        l2Num = l2.val;
        l1 = l1.next;
        l2 = l2.next;
        listNode.next = new ListNode((l1Num + l2Num) % 10 + overTen);
        overTen = (l1Num + l2Num) / 10;
        listNodeTmp = listNode.next;
        while (l1 != null && l2 != null) {
            l1Num = l1.val;
            l2Num = l2.val;
            l1 = l1.next;
            l2 = l2.next;
            listNodeTmp.next = new ListNode((l1Num + l2Num + overTen)%10);
            listNodeTmp = listNodeTmp.next;
            overTen = (l1Num + l2Num+overTen) / 10;
        }

        if (l2 == null && l1 != null) {
            while (l1 != null) {
                listNodeTmp.next = new ListNode((l1.val + overTen)%10);
                overTen = (l1.val + overTen)/10;
                l1 = l1.next;
                listNodeTmp = listNodeTmp.next;
            }
        }

        if (l2 != null && l1 == null) {
            while (l2 != null) {
                listNodeTmp.next = new ListNode((l2.val + overTen)%10);
                overTen = (l2.val + overTen)/10;
                l2 = l2.next;
                listNodeTmp = listNodeTmp.next;
            }
        }

        if (overTen > 0) {
            listNodeTmp.next = new ListNode(overTen%10);
            listNodeTmp = listNodeTmp.next;
            if (overTen-9>0) {
                listNodeTmp.next = new ListNode(1);
                listNodeTmp = listNodeTmp.next;
            }
        }

        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(7);
       // l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(2);
        //l2.next.next = new ListNode(7);
        ListNode listNode = new AddTwoNumbers().addTwoNumbers(l1, l2);

        System.out.println(listNode.val);
        while (listNode.next != null) {
            listNode = listNode.next;
            System.out.println(listNode.val);
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
/*
官方例子
* public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode p = l1, q = l2, curr = dummyHead;
    int carry = 0;
    while (p != null || q != null) {
        int x = (p != null) ? p.val : 0;
        int y = (q != null) ? q.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        curr.next = new ListNode(sum % 10);
        curr = curr.next;
        if (p != null) p = p.next;
        if (q != null) q = q.next;
    }
    if (carry > 0) {
        curr.next = new ListNode(carry);
    }
    return dummyHead.next;
}
*
* */
