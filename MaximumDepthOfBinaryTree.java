import javax.swing.tree.TreeNode;

public class MaximumDepthOfBinaryTree {
        int solve(TreeNode root) {
        if(root == null)return 0;

        int lh = solve(root.left);
        int rh = solve(root.right);

        return Math.max(lh,rh)+1;
    }
    public int maxDepth(TreeNode root) {
        return solve(root);
    }
}
