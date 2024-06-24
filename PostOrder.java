import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class PostOrder {
    List<Integer>ans = new ArrayList<Integer>();
    void solve(TreeNode root){
        if(root == null)return;
        solve(root.left);
        solve(root.right);
        ans.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        solve(root);
        return ans;
    }
}
