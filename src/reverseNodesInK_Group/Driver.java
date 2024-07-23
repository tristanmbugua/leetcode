package reverseNodesInK_Group;

import java.util.*;

import mergeKSortedLists.ListNode;

/**
 * Problem:
 * <pre>
 * Problem Name: Reverse Nodes in k-Group
 * Problem Difficulty: Hard
 * </pre>
 * Solution Stats:
 * <pre>
 * Runtime: 3ms
 * Runtime Rank: Beats 6.48% of users with Java 
 * Memory: 44.01MB
 * Memory Rank: Beats 74.01% of users with Java
 * </pre>
 * @version Date: March 10th 2024
 * @author Tristan Mbugua
 */
public class Driver {

	public static void main(String[] args) {
		ListNode head = new 
				ListNode(1, new
				ListNode(2, new
				ListNode(3, new
				ListNode(4, new
				ListNode(5, new
				ListNode(6, new
				ListNode(7, new
				ListNode(8, new
				ListNode(9, new
				ListNode(10, new
				ListNode(11, null
						)))))))))));
		
		printList(head);
//		head = reverseKGroup(head, 2);
//		printList(head);
		reverseLinkedList(head, new ArrayList<Integer>());
		printList(head);
	}
	public static ListNode reverseKGroup(ListNode head, int k) {
		ListNode current = head;
		Boolean offSwitch = true;
		if (k > 1) {
			while(offSwitch) {
				ListNode reversingCurrent = new ListNode(current.val, current.next);
				Stack<Integer> list = new Stack<Integer>();
				for (int i = 0; i < k; i++) {
					list.push(reversingCurrent.val);
					if (reversingCurrent.next == null) {
						if (((i+1) >= k)) {
							break;
						}
						offSwitch=false;
						break;
					} else {
						reversingCurrent = reversingCurrent.next;
					}
				}
				if (offSwitch) {
					for (int i = 0; i < k; i++) {
						current.val = list.pop();
						if (current.next != null) {
							current = current.next;
						}
					}
				}
			}
		}
		return head;
    }
	
	public static void printList(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public static void reverseLinkedList(ListNode current, List<Integer> stack) {
		if (current != null) {
			stack.add(current.val);
			reverseLinkedList(current.next, stack);
//			current.val = stack.removeFirst();
		}
		return;
	}
}


