import javax.swing.tree.TreeNode;

public class DiameterBinaryTree {
    int maxi = 0;
    int solve(TreeNode root) {
        if(root == null)return 0;

        int lh = solve(root.left);
        int rh = solve(root.right);

        maxi = Math.max(maxi,lh+rh);

        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return maxi;
    }
}
