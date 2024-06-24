import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class PreOrder {
    List<Integer>ans = new ArrayList<Integer>();
    void solve(TreeNode root){
        if(root == null)return;
        
        ans.add(root.val);
        solve(root.left);
        solve(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        solve(root);
        return ans;
    }
}
