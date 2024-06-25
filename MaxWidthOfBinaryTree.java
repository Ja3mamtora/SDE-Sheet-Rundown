import java.util.Deque;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;

public class MaxWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)return 0;

        Deque<pair>q = new LinkedList<>();
        q.add(new pair(root,0));

        int ans = 0;
        while(!q.isEmpty()) {
            int st = q.peek().sz;
            int en = q.peekLast().sz;

            ans = Math.max(ans,en-st+1);
            int len = q.size();

            while(len-- > 0) {
                pair curr = q.remove();
                TreeNode currNode = curr.node;
                int indx = curr.sz;

                if(currNode.left != null)q.add(new pair(currNode.left,2*indx+1));
                if(currNode.right != null)q.add(new pair(currNode.right,2*indx+2));
            }
        }
        return ans;
    }
}
class pair {
    public TreeNode node;
    public Integer sz;

    public pair(TreeNode node, Integer sz) {
        this.node = node;
        this.sz = sz;
    }
}
