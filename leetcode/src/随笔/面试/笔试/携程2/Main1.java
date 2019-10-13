package 随笔.面试.笔试.携程2;

/**
 * @author zjg
 * @ClassName Main1
 * @Description TODO
 * @Date 2019/9/4 19:22
 **/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main1 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    /*请完成下面这个函数，实现题目要求的功能
     ******************************开始写代码******************************/
    static ListNode partition(ListNode head,int m) {
        ListNode result = new ListNode(0);
        ListNode resultTmp = result;

        ListNode minList = new ListNode(0);
        ListNode minListTmp = minList;
        while (head != null) {
            if (head.val > m) {
                resultTmp.next = new ListNode(head.val);
                resultTmp = resultTmp.next;
                head = head.next;
                continue;
            }
            minListTmp.next = new ListNode(head.val);
            minListTmp = minListTmp.next;
            head = head.next;
        }
        minListTmp.next = result.next;
        return minList.next;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ListNode head=null;
        ListNode node=null;
        int m=in.nextInt();
        int index = 0;
        while(index++ < 6){
            int v=in.nextInt();
            if(head==null){
                node=new ListNode(v);
                head=node;
            }else{
                node.next=new ListNode(v);
                node=node.next;
            }
        }
        System.out.println("---");
        head= partition(head,m);
        if(head!=null){
            System.out.print(head.val);
            head=head.next;
            while(head!=null){
                System.out.print(",");
                System.out.print(head.val);
                head=head.next;
            }
        }
        System.out.println();
    }
}
