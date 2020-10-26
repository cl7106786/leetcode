package lafenglong;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftLeaves {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        int i = sumOfLeftLeaves(root);
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        //1.需要判断是最左边的节点；(也就是每一层的第一个)
        //2.而且左右节点为空
        if(root == null) return 0;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        int sum = 0;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i = 0; i < size; i++)
            {
                TreeNode node = queue.poll();
                //如果是最左边的
                if(i == 0)
                {
                    //说明是叶子节点
                    if(node.left == null && node.right == null)
                    {
                        sum += node.val;
                    }
                }
                if(node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
            }
        }
        return sum;
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
