public class MergeTwoLL {
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode temp = ans;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                ListNode t = new ListNode(list1.val);
                temp.next = t;
                temp = temp.next;
                list1 = list1.next;
            } else {
                ListNode t = new ListNode(list2.val);
                temp.next = t;
                temp = temp.next;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            ListNode t = new ListNode(list1.val);
            temp.next = t;
            temp = temp.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            ListNode t = new ListNode(list2.val);
            temp.next = t;
            temp = temp.next;
            list2 = list2.next;
        }
        return ans.next;
    }
}
