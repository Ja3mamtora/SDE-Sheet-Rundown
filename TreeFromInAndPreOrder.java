import java.util.HashMap;

import javax.swing.tree.TreeNode;

public class TreeFromInAndPreOrder {
    TreeNode solve(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
            HashMap<Integer, Integer> mp) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        int inMap = mp.get(preorder[preStart]);

        int numsLeft = inMap - inStart;

        root.left = solve(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inMap - 1, mp);
        root.right = solve(preorder, preStart + numsLeft + 1, preEnd, inorder, inMap + 1, inEnd, mp);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            mp.put(inorder[i], i);
        }

        TreeNode root = solve(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, mp);
        return root;
    }
}
