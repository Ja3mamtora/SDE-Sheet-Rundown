import org.w3c.dom.Node;

public class ChildrenSumProperty {
     public static int isSumProperty(Node root)
    {
        if(root == null || (root.left == null && root.right == null)) return 1;
        
        int sum = 0;
        if(root.left != null) sum += root.left.data;
        if(root.right != null) sum += root.right.data;
        
        if(sum == root.data) {
            return ((isSumProperty(root.left)) & (isSumProperty(root.right)));
        }
        return 0;
    }
}
