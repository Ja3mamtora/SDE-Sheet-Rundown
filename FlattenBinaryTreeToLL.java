public class FlattenBinaryTreeToLL {
    TreeNode rightmost(TreeNode root) {
        if (root.right == null)
            return root;
        return rightmost(root.right);
    }

    public void flatten(TreeNode root) {
        if (root == null)
            return;
        TreeNode nextright;
        TreeNode rightMOST;

        while (root != null) {

            if (root.left != null) {
                rightMOST = rightmost(root.left);
                nextright = root.right;
                root.right = root.left;
                root.left = null;
                rightMOST.right = nextright;
            }
            root = root.right;
        }
    }
}
