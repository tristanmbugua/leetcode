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
		//Reverse the remainder
		int remainder = 0;
		int sum = 0;
		ListNode list = new ListNode();
		ListNode returnList = list;
		
		
		while(l1 != null || l2 != null) {
			list.next = new ListNode();
			list = list.next;
			
			if (l1 != null && l2 == null) {
				//Only l1 is active.
				
				//Find sum
				sum = l1.val + remainder;
				//Find remainder
				remainder = sum / 10;
				//Set value
				list.val = sum % 10;
			} else if (l2 != null && l1 == null) {
				//Only l2 is active.
				
				//Find sum
				sum = l2.val + remainder;
				//Find remainder
				remainder = sum / 10;
				//Set value
				list.val = sum % 10;
			} else {
				//Both nodes are active.
				
				//Find sum
				sum = l1.val + l2.val + remainder;
				//Find remainder
				remainder = sum / 10;
				//Set value
				list.val = sum % 10;
			}
			sum = 0;
			
			try { l1 = l1.next; } catch (Exception e) {}
			
			try { l2 = l2.next; } catch (Exception e) {}
			
		}
		
		if (remainder > 0) {
			list.next = new ListNode();
			list = list.next;
			list.val += remainder;
		}
		
		returnList = returnList.next;
		return returnList;
	}
}