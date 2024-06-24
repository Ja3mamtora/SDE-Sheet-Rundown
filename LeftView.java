import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class LeftView {
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer>ans = new ArrayList<Integer>();
      Queue<Node>q = new LinkedList<>();
      if(root == null)return ans;
      
      q.add(root);
      while(q.size() > 0) {
          int sz = q.size();
          
          for(int i = 0 ; i < sz ; i++) {
              Node curr = q.poll();
            
              if(i == 0) {
                  ans.add(curr.data);
              }
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
