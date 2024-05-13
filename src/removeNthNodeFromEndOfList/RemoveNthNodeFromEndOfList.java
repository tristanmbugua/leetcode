package removeNthNodeFromEndOfList;

import mergeKSortedLists.ListNode;

/**
 * Problem:
 * <pre>
 * Problem Name: Remove Nth Node From End of List
 * Problem Difficulty: Medium
 * </pre>
 * Solution Stats:
 * <pre>
 * Runtime: 0ms
 * Runtime Rank: Beats 100.00% of users with Java 
 * Memory: 41.41MB
 * Memory Rank: Beats 71.74% of users with Java
 * </pre>
 * @version Date: March 20th 2024
 * @author Tristan Mbugua
 */
public class RemoveNthNodeFromEndOfList {

	public static void main(String[] args) {
		ListNode list = new 
				ListNode(1, new 
				ListNode(2, null
						));
		
		removeNthFromEnd(list, 2);

	}
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		//Add an extra node for traversing.
		ListNode extra = new ListNode(0, head);
		
		ListNode oldList = extra;
		ListNode copy = extra;
		int end;
		
		//Find end of List
		for (end = 1; head.next != null; end++) {
			head = head.next;
		}
		
		//What is the position of the node?
		int position = end - n + 1;
		
		//Scroll to (n-1)th Node
		for (int i = 0; i < position-1; i++) {
			copy = copy.next;
		}
		
		if (position > 1) {
			copy.next = copy.next.next;
		} else if (position > 0) {
			return oldList.next.next;
		} else {
			return null;
		}
		return oldList.next;
	}
}