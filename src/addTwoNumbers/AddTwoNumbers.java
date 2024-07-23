package addTwoNumbers;

import java.util.*;

import mergeKSortedLists.ListNode;


/**
 * Problem:
 * <pre>
 * Problem Name: Add Two Numbers
 * Problem Difficulty: Medium
 * </pre>
 * Solution Stats:
 * <pre>
 * Runtime: 9ms
 * Runtime Rank: Beats 5.09% of users with Java 
 * Memory: 44.66MB
 * Memory Rank: Beats 22.59% of users with Java
 * </pre>
 * @version Date: March 20th 2024
 * @author Tristan Mbugua
 */
public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = 
				new ListNode(9, 
				new ListNode(9, 
				new ListNode(9, 
				new ListNode(9, null))));
		
		ListNode l2 = 
				new ListNode(9, 
				new ListNode(9, 
				new ListNode(9, 
				new ListNode(9,
				new ListNode(9, 
				new ListNode(9,
				new ListNode(9,  null)))))));
		
		addTwoNumbers(l1, l2);
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//The problem here is managing remainders.
		
		int remainder = 0;
		int sum = 0;
		ListNode head = new ListNode();
		
		
		ListNode curr = new ListNode();
		head.next = curr;
		
		while (l1 != null || l2 != null) {
			
			//Case 1: Both nodes active
			if (l1 != null && l2 != null) {
				sum = l1.val + l2.val + remainder;
				remainder = sum % 9;
				
				curr.val = remainder;
				remainder -= sum;
				
			}
			//Case 2: Only l1 node active
			else if (l1 != null && l2 == null) {
				
			}
			//Case 3: Only l2 node active
			 else if (l1 != null && l2 == null) {
				 
			 }
		}
		
		
		return head;
	}
}