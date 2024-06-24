import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class RightView {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode>q = new LinkedList<>();
        ArrayList<Integer>ans = new ArrayList<>();
        if(root == null)return ans;

        q.add(root);

        while(!q.isEmpty()) {
            int n = q.size();

            for(int i = 1; i <= n ; i++) {
                TreeNode curr = q.poll();
                if(i == n)ans.add(curr.val);

                if(curr.left != null) {
                    q.add(curr.left);
                }

                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        return ans;
    }
}
