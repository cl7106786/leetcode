package lafenglong;

import java.util.ArrayList;
import java.util.List;

public class ReorderList {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        ListNode listNode = reorderList(node);
        System.out.println(listNode);
    }
    public static ListNode reorderList(ListNode head) {
        //递归解决？recursion
        //ArrayList
        if(head == null) return head;
        List<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while(current != null)
        {
            list.add(current);
            current = current.next;
        }
        int size = list.size();

        //从链表后的节点开始取
        ListNode first = head;
        int length = size / 2;
        //总共只需要遍历 size / 2 次
        int flag = size % 2;
        for(int i = size - 1; i >= length; i--)
        {

            //从后开始遍历
            ListNode tmp = list.get(i);
            //记录当前的下一个节点
            ListNode second = first.next;
            first.next = tmp;
            tmp.next = second;
            first = second;
            if(i == length )
            {
                if(flag == 2)
                {
                    first.next = null;
                }
                else
                {
                    first = second;
                }
            }

        }
        return head;
    }
}
