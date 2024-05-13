package palindromeLinkedList;

import mergeKSortedLists.ListNode;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		ListNode head = new 
				ListNode(1, new
				ListNode(2, new
				ListNode(2, new
				ListNode(1, null
						))));
		
		System.out.println(isPalindrome(head));

	}

	public static boolean isPalindrome(ListNode head) {
		ListNode headCopy = reverseLinkedList(new ListNode(head.val, head.next));
		
		while (head != null && headCopy != null) {
			if (head.val != headCopy.val) {
				return false;
			}
			
			head = head.next;
			headCopy = headCopy.next;
		}
		
		return true;
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