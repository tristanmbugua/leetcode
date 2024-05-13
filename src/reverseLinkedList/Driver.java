package reverseLinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import mergeKSortedLists.ListNode;

/**
 * Problem:
 * <pre>
 * Problem Name: Reverse Linked List
 * Problem Difficulty: Easy
 * </pre>
 * Solution Stats:
 * <pre>
 * Runtime: 0ms
 * Runtime Rank: Beats 100.00% of users with Java 
 * Memory: 42.46MB
 * Memory Rank: Beats 40.27% of users with Java
 * </pre>
 * @version Date: March 20th 2024
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
		
		head = reverseLinkedList(head);
		System.out.println("");
//		printList(head);
	}
	
	public static ListNode reverseLinkedList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		ListNode next = head.next;
		
		while (curr.next != null) {
			next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
		
		next = curr.next;
		curr.next = prev;
		
		return curr;
	}
}