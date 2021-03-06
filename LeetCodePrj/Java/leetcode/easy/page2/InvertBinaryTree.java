package leetcode.easy.page2;

import leetcode.common.TreeNode;

/**
 * @author Kyle
 * @create 2018/9/23 16:06
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode tempNode = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tempNode);

        return root;
    }
}
