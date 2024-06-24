import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import org.w3c.dom.Node;
class Information {
    Node node;
    int hd;
    
    public Information(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
public class TopView {
     static ArrayList<Integer> topView(Node root) {
        // add your code
        TreeMap<Integer,Integer>mp = new TreeMap<>();
        Queue<Information>q = new LinkedList<>();
        
        q.add(new Information(root,0));
        mp.put(0,root.data);
        
        while(!q.isEmpty()) {
            Information curr = q.poll();
            if(!mp.containsKey(curr.hd)) {
                mp.put(curr.hd,curr.node.data);
            }
            
            if(curr.node.left != null) {
                q.add(new Information(curr.node.left,curr.hd-1));
            }
            
            if(curr.node.right != null) {
                q.add(new Information(curr.node.right,curr.hd+1));
            }
        }
        
        ArrayList<Integer>ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer>it: mp.entrySet()) {
            ans.add(it.getValue());
        }
        
        return ans;
    }

}
