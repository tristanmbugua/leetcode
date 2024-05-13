package reorderList;

import mergeKSortedLists.ListNode;

public class ReorderList {

	public static void main(String[] args) {
		ListNode head = new 
				ListNode(1, null
						);
		
		reorderList(head);
		System.out.println(head);

	}
	
	public static void reorderList(ListNode head) {
		ListNode headCopy = head;
		//Find right before end.
		int totalMoves = 0;
		while (head.next != null) {
			//Grab length.
			totalMoves++;
			head = head.next;
		}

		if (totalMoves == 0) {
			return;
		}
		
		head = headCopy;
		
		//Find moves necessary to complete operation.
		//Use integer division.
		totalMoves = (totalMoves) / 2;
		
		
		ListNode endCopy_ = head;
		ListNode headNext;
		
		if (totalMoves < 2) {
			endCopy_ = head;
			//Scroll to right before end, grab end and adjust right-before end.
			while (endCopy_.next.next != null) {
				endCopy_ = endCopy_.next;
			}
			
			//Attach end between first and second.
			headNext = head.next;
			endCopy_.next.next = headNext;
			head.next = endCopy_.next;
			
			endCopy_.next = null;
			
			return;
		}
		
		//In a loop based on total moves
		for (int i = 0; i <= totalMoves; i++) {
			endCopy_ = head;
			//Scroll to right before end, grab end and adjust right-before end.
			while (endCopy_.next.next != null) {
				endCopy_ = endCopy_.next;
			}
			
			//Attach end between first and second.
			headNext = head.next;
			endCopy_.next.next = headNext;
			head.next = endCopy_.next;
			
			endCopy_.next = null;
			
			//Adjust head for further operations.
			head = head.next.next;
		}
	}
}