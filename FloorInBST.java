public class FloorInBST {
    public static int floorInBST(TreeNode<Integer> root, int x) {
        int currMini = -1;
        while(root != null) {
            if(root.data <= x) {
                currMini = Math.max(currMini,root.data);
                root = root.right;
            }
            else {
                root = root.left;
            }
        }
        return currMini;
    }
}
