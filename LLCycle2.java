public class LLCycle2 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int flag = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            return null;

        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;

    }
}
