import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class InOrder {
    List<Integer>ans = new ArrayList<Integer>();
    void solve(TreeNode root){
        if(root == null)return;
        solve(root.left);
        ans.add(root.val);
        solve(root.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        solve(root);
        return ans;
    }
}
