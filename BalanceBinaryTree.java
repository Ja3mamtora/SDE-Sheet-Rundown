import javax.swing.tree.TreeNode;

public class BalanceBinaryTree {
    int check(TreeNode root) {
        if(root == null) return 0;

        int lh = check(root.left);
        if(lh == -1)return -1;
        int rh = check(root.right);
        if(rh == -1)return -1;

        if(Math.abs(lh-rh) > 1)return -1;

        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(check(root) == -1)return false;
        return true;
    }
}
