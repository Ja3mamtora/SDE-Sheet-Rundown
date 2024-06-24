import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class TreeTraversal {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {

        // Write your code here.

        List<List<Integer>> ans = new ArrayList<>();

        ans.add(new ArrayList(in(root)));

        ans.add(new ArrayList(pre(root)));

        ans.add(new ArrayList(post(root)));

        return ans;

    }

    public static List in(TreeNode root) {

        TreeNode node = root;

        Stack<TreeNode> st = new Stack<>();

        List<Integer> l = new ArrayList<>();

        while (true) {

            if (node != null) {

                st.push(node);

                node = node.left;

            }

            else {

                if (st.isEmpty()) {

                    break;

                }

                node = st.pop();

                l.add(node.data);

                node = node.right;

            }

        }

        return l;

    }

    public static List pre(TreeNode root) {

        TreeNode node = root;

        Stack<TreeNode> st = new Stack<>();

        List<Integer> l = new ArrayList<>();

        while (true) {

            if (node != null) {

                l.add(node.data);

                st.push(node);

                node = node.left;

            }

            else {

                if (st.isEmpty()) {

                    break;

                }

                node = st.pop();

                node = node.right;

            }

        }

        return l;

    }

    public static List post(TreeNode root) {

        TreeNode node = root;

        Stack<TreeNode> st = new Stack<>();

        List<Integer> l = new ArrayList<>();

        while (node != null || !st.isEmpty()) {

            if (node != null) {

                st.push(node);

                node = node.left;

            }

            else

            {

                TreeNode temp = st.peek().right;

                if (temp == null) {

                    temp = st.peek();

                    st.pop();

                    l.add(temp.data);

                    while (!st.isEmpty() && temp == st.peek().right) {

                        temp = st.peek();

                        st.pop();

                        l.add(temp.data);

                    }

                }

                else {

                    node = temp;

                }

            }

        }

        return l;

    }
}
