package lafenglong;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
   /* public String toString()
    {
        StringBuffer sb  = new StringBuffer();
        while(this != null)
        {
            sb.append(this);
        }

        return sb.toString();
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        ListNode listNode = (ListNode) o;
        return val == listNode.val;
    }

}
