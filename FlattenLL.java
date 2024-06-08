import java.util.ArrayList;
import java.util.Collections;

public class FlattenLL {
    public class ListNode {
        int data;
        ListNode next;
        ListNode bottom;

        ListNode() {
        }

        ListNode(int d) {
            this.data = d;
            this.next = null;
            this.bottom = null;
        }
    }

    ListNode flatten(ListNode root) {
        // Your code here
        ListNode temp = root;
        ArrayList<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.data);
            ListNode b = temp.bottom;
            while (b != null) {
                list.add(b.data);
                b = b.bottom;
            }
            temp = temp.next;

        }
        Collections.sort(list);

        ListNode result = null;
        temp = null;
        for (int i = 0; i < list.size(); i++) {
            int d = list.get(i);
            ListNode temp2 = new ListNode(d);
            if (result == null) {
                result = temp2;
                temp = result;
            } else {
                temp.bottom = temp2;
                temp = temp.bottom;
            }
        }
        return result;
    }
}
