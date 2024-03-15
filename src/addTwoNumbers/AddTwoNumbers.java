package addTwoNumbers;

import java.util.*;

import mergeKSortedLists.ListNode;

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
		ListNode copyl1 = l1;
		
		List<Integer> listOfValues = new ArrayList<Integer>();
		
		int sum = 0;
		int carryover = 0;
		
		while (l1 !=  null || l2 != null) {
			if (l1 ==  null && l2 != null) {
				sum = l2.val + carryover; 
				if ((sum) > 9) {
					listOfValues.add((sum) % 10);
					carryover = ((sum - (sum % 10))/10);
				} else {
					listOfValues.add(sum);
				}
				l2 = l2.next;
				sum = 0;
				
				//Original
				/*
				 * listOfValues.add(l2.val + carryover); l2 = l2.next;
				 */
			} else if (l1 !=  null && l2 == null) {
				sum = l1.val + carryover; 
				if ((sum) > 9) {
					listOfValues.add((sum) % 10);
					carryover = ((sum - (sum % 10))/10);
				} else {
					listOfValues.add(sum);
				}
				l1 = l1.next;
				sum = 0;
			} else if (l1 !=  null && l2 != null) {
				sum = l1.val + l2.val + carryover; 
				if ((sum) > 9) {
					listOfValues.add((sum) % 10);
					carryover = ((sum - (sum % 10))/10);
					l1 = l1.next;
					l2 = l2.next;
				} else {
					listOfValues.add(sum);
					l1 = l1.next;
					l2 = l2.next;
				}
				sum = 0;
			}
		}
		
		
		
		if (listOfValues.size() > 0) {
			l1 = new ListNode(listOfValues.removeFirst(), null);
			copyl1 = l1;
			while (listOfValues.size() > 0) {
				l1.next = new ListNode(listOfValues.removeFirst(), null);
				l1 = l1.next;
			}
		}
		
		return copyl1;
	}
}