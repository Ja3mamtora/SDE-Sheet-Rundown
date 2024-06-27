import java.util.ArrayList;
import java.util.Stack;

import org.w3c.dom.Node;

public class BoundaryTraversal {
    ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (!isLeaf(node)) {
            res.add(node.data);
        }
        insertLeftBoundary(res, node);
        insertLeafNode(res, node);
        insertRightBoundary(res, node);
        return res;

    }

    public boolean isLeaf(Node node) {
        return (node.left == null && node.right == null);
    }

    public void insertLeftBoundary(ArrayList<Integer> res, Node root) {
        Node leftNode = root.left;
        while (leftNode != null) {
            if (isLeaf(leftNode)) {
                break;
            }
            res.add(leftNode.data);
            if (leftNode.left != null) {
                leftNode = leftNode.left;
            } else {
                leftNode = leftNode.right;
            }
        }
    }

    public void insertRightBoundary(ArrayList<Integer> res, Node root) {
        Node rightNode = root.right;
        Stack<Integer> stack = new Stack<>();
        while (rightNode != null) {
            if (isLeaf(rightNode)) {
                break;
            }
            //
            stack.push(rightNode.data);
            if (rightNode.right != null) {
                rightNode = rightNode.right;
            } else {
                rightNode = rightNode.left;
            }
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
    }

    public void insertLeafNode(ArrayList<Integer> res, Node root) {
        if (root == null) {
            return;
        }
        if (isLeaf(root)) {
            res.add(root.data);
        }
        insertLeafNode(res, root.left);
        insertLeafNode(res, root.right);
    }
}
