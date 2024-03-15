package removeZeroSumConsecutiveNodesFromLinkedList;

import mergeKSortedLists.ListNode;

public class RemoveZeroSumConsecutiveNodesfromLinkedList {

	public static void main(String[] args) {
		

	}
	
	public static ListNode removeZeroSumConsecutiveNodesFromLinkedList(ListNode head) {
		ListNode headStore = head;
		ListNode prev = null;
		ListNode current = head;
		ListNode next;
		boolean flag = true;
		while (flag == true) {
			flag = false;
			head = headStore;
			while (current.next != null) {
				next = current.next;
				if ((next.val + current.val) == 0) {
					if (prev != null) {
						prev.next = next.next;
					} else {
						head = current;
					}
					flag = true;
				}
				prev = current;
				current = next;
			}
		}
		
		return head;
	}
}
