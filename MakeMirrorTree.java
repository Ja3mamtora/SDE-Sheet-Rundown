import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class MakeMirrorTree {
    void mirror(Node node) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            Node t = q.poll();
            Node mp;

            if (t.left != null)
                q.add(t.left);
            if (t.right != null)
                q.add(t.right);

            mp = t.left;
            t.left = t.right;
            t.right = mp;
        }
    }
}
