package lafenglong;

public class GetMinimumDifference {
    int minDiff = Integer.MAX_VALUE;
    int pre = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        //二叉搜索树，中序遍历是有序的（左根右）
        if(root == null) return 0;
        pre = root.val;
        order(root);
        return minDiff;
    }

    private void order(TreeNode root)
    {
        if(root == null) return;
        if(root.left != null) order(root.left);
        int val = root.val;
        int abs = Math.abs(val - pre);
        if(abs < minDiff)
        {
            minDiff = abs;
        }
        pre = val;
        if(root.right != null) order(root.right);

    }

    public static void main(String[] args) {
        GetMinimumDifference getMinimumDifference = new GetMinimumDifference();
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        node.right = node1;
        node1.left = node2;
        int minimumDifference = getMinimumDifference.getMinimumDifference(node);
    }
}
