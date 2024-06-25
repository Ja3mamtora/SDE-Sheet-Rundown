import java.util.ArrayList;

import org.w3c.dom.Node;

public class RootToLeafPaths {
     ArrayList<ArrayList<Integer>>ans = new ArrayList<>();
    
    void solve(Node curr, ArrayList<Integer>ds) {
        if(curr == null)return;
        if(curr.left == null && curr.right == null) {
            ds.add(curr.data);
            ans.add(new ArrayList(ds));
            ds.remove(ds.size()-1);
            return;
        }
        
        ds.add(curr.data);
        if(curr.left != null) solve(curr.left,ds);
        if(curr.right != null)solve(curr.right,ds);
        ds.remove(ds.size()-1);
        
    }
    public  ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<Integer>ds = new ArrayList<>();
        solve(root,ds);
        return ans;
    }
}
