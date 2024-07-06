import javax.swing.tree.TreeNode;

public class CeilInBST {
  public  static int findCeil(TreeNode<Integer> root, int x) {
        int flr = (int)1e9;

        while(root != null) {
            if(root.data >= x) {
                flr = Math.min(flr,root.data);
                root = root.left;
            }
            else {
                root = root.right;
            }
        }

        if(flr == 1e9) return -1;
        return flr;
    }  
}
