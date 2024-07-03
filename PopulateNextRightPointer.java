import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class PopulateNextRightPointer {
     public Node connect(Node root) {
        if(root == null) return root;
        Queue<Node>q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int n = q.size();

            for(int i = 0 ; i < n ; i++) {
                Node curr = q.poll();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
                if (i == n-1) curr.next = null; 
                else curr.next = q.peek();
            }
        }
        return root;
    }
}
