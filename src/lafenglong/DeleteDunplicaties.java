package lafenglong;

import java.util.HashMap;
import java.util.Map;

public class DeleteDunplicaties {
    public static ListNode deleteDuplicates(ListNode head) {
        //先创建一个map，来存储链表的node，如果是重复的，则value=true，否则false
        Map<ListNode , Boolean> map = new HashMap();

        ListNode current = head;
        while(current != null)
        {
            if(map.containsKey(current))
            {
                map.put(current , true);
            }
            else
            {
                map.put(current , false);
            }
            current = current.next;
        }
        //重新回到头节点，重新遍历
        current = head;
        ListNode pre = null;
        ListNode dummy  = new ListNode(0);
        while(current != null)
        {
            if(map.get(current))
            {
                //直接跳过，不做任何处理
                current = current.next;
            }
            else{
                if(pre == null)
                {
                    dummy.next = current;
                    pre = current;
                }
                else{
                    pre.next = current;
                    pre = current;
                }
                current = current.next;

            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        ListNode listNode1 = deleteDuplicates(listNode);
    }
}
