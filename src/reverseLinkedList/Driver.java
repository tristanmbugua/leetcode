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
 * Runtime: 1ms
 * Runtime Rank: Beats 5.37% of users with Java 
 * Memory: 42.33MB
 * Memory Rank: Beats 54.90% of users with Java
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
		printList(reverseLinkedList(head));
//		printList(head);
	}
	
	public static ListNode reverseLinkedList(ListNode head) {
		//Pull Values
		Stack<Integer> list = new Stack<Integer>();
		if (head != null) {
			ListNode copy = new ListNode(head.val, head.next);
			while(copy.next != null) {
				list.push(copy.val);
				copy = copy.next;
			}
			list.push(copy.val);
			
			//Fill values
			copy = head;
			while (head.next != null && list.size() > 0) {
				head.val = list.pop();
				head = head.next;
			}
			head.val = list.pop();
			return copy;
		} else {
			return head;
		}
	}
	
	public static void printList(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
}