import javax.swing.tree.TreeNode;

public class SymmetricTree {
    boolean solve(TreeNode l, TreeNode r) {
        if(r == null && l == null)return true;

        if(r == null || l == null || l.val != r.val)return false;

        return solve(l.left,r.right)&&solve(l.right,r.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;

        return solve(root.left,root.right);
    }
}
