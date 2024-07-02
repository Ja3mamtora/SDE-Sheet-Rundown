import javax.swing.tree.TreeNode;

public class TreeFromInAndPostOrder {
    TreeNode solve(int[] postorder, int poStart, int poEnd, int[] inorder, int inStart, int inEnd) {
        if (poStart > poEnd || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[poEnd]);

        int inMap = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == postorder[poEnd]) {
                inMap = i;
                break;
            }
        }

        int numsLeft = inMap - inStart;
        int numsRight = inEnd - inMap;

        root.left = solve(postorder, poStart, poStart + numsLeft - 1, inorder, inStart, inMap - 1);
        root.right = solve(postorder, poEnd - numsRight, poEnd - 1, inorder, inMap + 1, inEnd);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = solve(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }
}
