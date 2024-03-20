package mergeInBetweenLinkedLists;

import mergeKSortedLists.ListNode;

/**
 * Problem:
 * <pre>
 * Problem Name: Merge In Between Linked Lists
 * Problem Difficulty: Medium
 * </pre>
 * Solution Stats:
 * <pre>
 * Runtime: 2ms
 * Runtime Rank: Beats 40.65% of users with Java 
 * Memory: 45.95MB
 * Memory Rank: Beats 98.50% of users with Java
 * </pre>
 * @version Date: March 20th 2024
 * @author Tristan Mbugua
 */
public class MergeInBetweenLinkedLists {

	public static void main(String[] args) {
		ListNode list = new 
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
		ListNode list2 = new 
				ListNode(7, new
				ListNode(6, new
				ListNode(5, new
				ListNode(4, null
						))));
		
		mergeInBetween(list, 4, 7, list2);
		
		
	}
	
	public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode oldList = list1;
        ListNode nodeStart = null;
        ListNode nodeEnd = null;
        
        for (int i = 1; oldList != null; i++) {
			if (i == a) {
				nodeStart = oldList;
			}
			if (i == (b+2)) {
				nodeEnd = oldList;
			}
			oldList = oldList.next;
		}
		
        nodeStart.next = list2;
        
        while(nodeStart.next != null) {
        	nodeStart = nodeStart.next;
        }
        
        nodeStart.next = nodeEnd;
		return list1;
    }
}
