package mergeKSortedLists;

import java.util.ArrayList;
import java.util.List;


/**
 * Problem:
 * <pre>
 * Problem Name: Merge k Sorted Lists
 * Problem Difficulty: Hard
 * </pre>
 * Solution Stats:
 * <pre>
 * Runtime: 1028ms
 * Runtime Rank: Beats 5.15% of users with Java 
 * Memory: 45.25MB
 * Memory Rank: Beats 7.82% of users with Java
 * </pre>
 * @version Date: March 10th 2024
 * @author Tristan Mbugua
 */
public class Driver {

	public static void main(String[] args) {
		
		/*
		 * ListNode one = new ListNode(1, new ListNode(4, new ListNode(5, new
		 * ListNode(6, null )))); ListNode two = new ListNode(1, new ListNode(3, new
		 * ListNode(4, new ListNode(6, null )))); ListNode three = new ListNode(2, new
		 * ListNode(6, new ListNode(7, new ListNode(10, new ListNode(12, new
		 * ListNode(15, new ListNode(17, null )))))));
		 */
		
		ListNode[] lists = {
				new 
				ListNode(1, new
				ListNode(4, new
				ListNode(5, new
				ListNode(6, null
						)))),
				
				null,
				new 
				ListNode(1, new
				ListNode(3, new
				ListNode(4, new
				ListNode(6, null
						))))
						
		};
		ListNode finalNode = mergeKLists(lists);
		
		printList(finalNode);
	}
	
	public static ListNode mergeKLists(ListNode[] lists) {
		if (lists.length > 0) {
			ListNode head = new ListNode();
			int strikes = 0;
			List<Integer> values = new ArrayList<Integer>();
			while (strikes < lists.length) {
				strikes = 0;
				for (int j = 0; j < lists.length; j++) {
					//This loop goes over each list.
					//Find the lowest value for this iteration.
					//Collect all for this round, then sort them.
					if (lists[j] != null) {
						values.add(lists[j].val);
						lists[j] = lists[j].next;
					} else {
						strikes++;
					}
				}
			}
			if (values.size() > 0) {
				values = sortList(values);
				head = fillList(head, values);
			} else {
				return null;
			}
			
			return head;
		}
		return null;
	}

	public static List<Integer> sortList(List<Integer> list) {
		int holder = 0;
		Object[] arr;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < (list.size() - i - 1); j++) {
				int test = Integer.compare(list.get(j), list.get(j+1));
				if (test >  0) {
					holder = list.get(j);
					list.set(j, list.get(j+1));
					list.set((j+1), holder);
				}
			}
		}
		return list;
	}
	
	public static ListNode fillList(ListNode head, List<Integer> list) {
		ListNode copy = head;
		while (list.size() > 1) {
			copy.val = list.removeFirst();
			copy.next = new ListNode();
			copy = copy.next;
		}
		copy.val = list.removeFirst();
		copy.next = null;
		return head;
	}
	
	public static void printList(ListNode head) {
		while (head.next != null) {
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println(head.val);
	}
}