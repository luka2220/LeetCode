import java.util.Hashtable;

public class Solution {
    public static void main(String[] args) {
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        Hashtable<ListNode, Integer> ht = new Hashtable<>();

        while (current != null) {
            if (ht.containsKey(current)) {
                return true;
            }

            ht.put(current, 1);
            current = current.next;
        }

        return false;
    }
}