package code2019.code19_8.code12_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zjg
 * @ClassName MergekSortedLists
 * @Description TODO
 * @Date 2019/8/12 16:11
 **/
public class MergekSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode result = new ListNode(0);
        ListNode resultTmp = result;
        List<ListNode> listNodes = new ArrayList<>(Arrays.asList(lists));
        while (listNodes != null && listNodes.size() > 0) {
            if (listNodes.get(0) == null) {
                listNodes.remove(0);
                continue;
            }
            //记录最小的链表的位置
            int thList = 0;
            //记录最小值
            int min = listNodes.get(0).val;
            for (int i = 0; i < listNodes.size(); i++) {
                if (listNodes.get(i) == null) {
                    listNodes.remove(i);
                    i--;
                    continue;
                }
                int tmp = listNodes.get(i).val;
                if (tmp < min) {
                    thList = i;
                    min = tmp;
                }
            }
            resultTmp.next = listNodes.get(thList);
            resultTmp = resultTmp.next;
            listNodes.set(thList, resultTmp.next);
            if (listNodes.get(thList) == null) {
                listNodes.remove(thList);
            }
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;


        ListNode listNode7 = new ListNode(2);
        ListNode listNode8 = new ListNode(6);
        listNode7.next = listNode8;

        ListNode result = new MergekSortedLists().mergeKLists(new ListNode[]{listNode1, listNode4, listNode7});

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