package lafenglong;

public class RemoveNthFromEnd {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);

        ListNode node1 = new ListNode(2);
        node.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(5);
        node3.next = node4;
        ListNode listNode = removeNthFromEnd(node, 2);
        System.out.println(listNode);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        //如果删除的是头节点或者尾节点

        //一次遍历的方式就是通过快慢指针做
        ListNode fast = head;
        ListNode slow = head;

        //fast节点先走n步，然后slow节点和fast一起走到尾节点
        n ++;
        while(fast != null && n-- != 0)
        {
            fast = fast.next;
        }

        //fast 和slow走length - n步
        while(fast != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        if(slow.next != null)
        {
            slow.next = slow.next.next;
        }

        return head;
    }
}
