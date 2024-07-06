import javax.swing.tree.TreeNode;

public class KthSmallestInBST {
    int ans = -1;
    int ind  = 0;
    void helper(TreeNode root, int k) {
        if(root == null) return;

        helper(root.left,k);
        ind++;
        if(ind == k) {
            ans = root.val;
            return;
        }
        helper(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return ans;
    }
}
