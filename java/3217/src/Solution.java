import java.util.Set;
import java.util.HashSet;

class Solution {
	public static void main(String[] args) {
		ListNode head = null;
		ListNode curr = null;

		for (int i = 1; i <= 5; ++i) {
			if (i == 1) {
				head = new ListNode(i);
				curr = head;
				continue;
			}

			ListNode node = new ListNode(i);
			curr.next = node;
			curr = curr.next;
		}

		printList(head);
	}

	public static void printList(ListNode head) {
		ListNode curr = head;

		while (curr != null) {
			System.out.print(curr.val + " -> ");
			curr = curr.next;
		}
	}

	public static class ListNode {
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

	public ListNode modifiedList(int[] nums, ListNode head) {
		Set<Integer> valuesToRemove = new HashSet<>();
		for (int num : nums) {
			valuesToRemove.add(num);
		}

		while (head != null && valuesToRemove.contains(head.val)) {
			head = head.next;
		}

		if (head == null) {
			return null;
		}

		ListNode current = head;
		while (current.next != null) {
			if (valuesToRemove.contains(current.next.val)) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

		return head;
	}
}
