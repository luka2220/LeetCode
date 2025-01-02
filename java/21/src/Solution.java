public class Solution {
    public static void main(String[] args) {

    }

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
        ListNode head = null;

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        if (list1.val <= list2.val) {
            head = new ListNode(list1.val);
            list1 = list1.next;
        } else {
            head = new ListNode(list2.val);
            list2 = list2.next;
        }

        ListNode current = head;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                var newNode = new ListNode(list1.val);
                current.next = newNode;
                current = current.next;
                list1 = list1.next;
            } else {
                var newNode = new ListNode(list2.val);
                current.next = newNode;
                current = current.next;
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return head;
    }
}