import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class BottomView {
    class Information {
        Node node;
        int hd;
        
        public Information(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    public ArrayList <Integer> bottomView(Node root)
    {
    ArrayList<Integer> list = new ArrayList<>();
        
        int max = 0, min = 0;
        
        Queue<Information> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        
        q.add(new Information(root, 0));
        q.add(null);
        
        while(!q.isEmpty()) {
            
            Information info = q.poll();
            
            if(info == null) {
                
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
                
            } else {
                
                map.put(info.hd, info.node);
                
                if(info.node.left != null) {
                    q.add(new Information(info.node.left, info.hd-1));
                    min = Math.min(info.hd-1, min);
                }
                
                if(info.node.right != null) {
                    q.add(new Information(info.node.right, info.hd+1));
                    max = Math.max(max, info.hd+1);
                }
            }
        }
        
        // System.out.println(map);
        
        for(int i=min; i<=max; i++) {
            list.add(map.get(i).data);
        }
        
        return list; 
    }
}
