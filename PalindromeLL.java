import java.util.ArrayList;
import java.util.*;

public class PalindromeLL {
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

    @SuppressWarnings("unchecked")
    public boolean isPalindrome(ListNode head) {
        @SuppressWarnings("rawtypes")
        List<Integer> list = new ArrayList();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int left = 0;
        int right = list.size() - 1;
        while (left < right && list.get(left) == list.get(right)) {
            left++;
            right--;
        }
        return left >= right;
    }
}
