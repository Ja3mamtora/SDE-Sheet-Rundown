import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class ZigZagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans = new ArrayList<>();
        Boolean flag = false;
        if(root == null)return ans;

        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int n = q.size();

            List<Integer>t = new ArrayList<>();
            for(int i = 0 ; i < n ; i++) {
                TreeNode curr = q.poll();
                t.add(curr.val);
                if(curr.left != null)q.add(curr.left);
                if(curr.right != null)q.add(curr.right);
            }

            if(flag) {
                Collections.reverse(t);
                ans.add(t);
                flag = !flag;
            }
            else {
                ans.add(t);
                flag = !flag;
            }
        }
        return ans;
    }
}
