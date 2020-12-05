### [110\. 平衡二叉树](https://leetcode-cn.com/problems/balanced-binary-tree/)

Difficulty: **简单**


给定一个二叉树，判断它是否是高度平衡的二叉树。

本题中，一棵高度平衡二叉树定义为：

> 一个二叉树_每个节点 _的左右两个子树的高度差的绝对值不超过 1 。

**示例 1：**

![](https://assets.leetcode.com/uploads/2020/10/06/balance_1.jpg)

```
输入：root = [3,9,20,null,null,15,7]
输出：true
```

**示例 2：**

![](https://assets.leetcode.com/uploads/2020/10/06/balance_2.jpg)

```
输入：root = [1,2,2,3,3,null,null,4,4]
输出：false
```

**示例 3：**

```
输入：root = []
输出：true
```

**提示：**

*   树中的节点数在范围 `[0, 5000]` 内
*   `-10<sup>4</sup> <= Node.val <= 10<sup>4</sup>`


#### Solution

Language: **全部题目**
**从顶至底**
```java

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
       if (root == null) {
            return true;
        } else {
            return Math.abs(height(root.left) - height(root.right)) <= 1 && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        }
    }
    
    private int height(TreeNode node)
    {
        if(node == null)
        {
            return 0;
        }
        return Math.max(height(node.left) , height(node.right)) + 1;
    }
    
}
```


## 复杂度分析
### 时间复杂度：
 有N个节点，每个节点都需要去计算height，计算高度的时间复杂度O(logN),所以总的时间复杂度是O(N(logN);
### 空间复杂度：
取决于递归栈的深度，当二叉树蜕化为链表，栈的深度为O(N)

### 从底至顶

