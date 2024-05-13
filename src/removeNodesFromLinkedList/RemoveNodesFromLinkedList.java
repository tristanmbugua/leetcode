package removeNodesFromLinkedList;

import java.util.*;
import mergeKSortedLists.ListNode;

public class RemoveNodesFromLinkedList {

	public static void main(String[] args) {
		

	}
	public static ListNode removeNodes(ListNode head) {
		ListNode originalHead = head;
		ListNode current = head;
		ListNode search = new ListNode();
		
		//Write down all dangerous nodes. ArrayList.
        ArrayList<Integer> bad = new ArrayList<Integer>();
        
        //n^2 efficiency.
        while (current != null) {
        	search = current;
        	while (search!= null) {
        		if (search.val > current.val) {
        			bad.add(current.val);
        		}
        		search = search.next;
        	}
        	current = current.next;
        }
        
        //Create new Linked List.
        
        return new ListNode();
    }

}
