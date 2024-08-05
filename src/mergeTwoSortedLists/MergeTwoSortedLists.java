package mergeTwoSortedLists;

import mergeKSortedLists.ListNode;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        mergeTwoLists(
                new ListNode(1,
                new ListNode(2,
                new ListNode(4))),
                new ListNode(1,
                new ListNode(3,
                new ListNode(4)))
        );
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Edge case: Both lists are empty
        if (list1 == null && list2 == null) {
            return null;
        }

        //Edge case: List one is empty
        if (list1 == null) {
            return list2;
        }

        //Edge case: List two is empty
        if (list2 == null) {
            return list1;
        }

        //Initialize new LinkedList
        ListNode dummy;

        /* If the first value of the first list is smaller, initialize the list using said value. */
        if (list1.val < list2.val) {
            dummy = new ListNode(list1.val);
            list1 = list1.next;

        /* If the first value of the first list is smaller, initialize the list using said value. */
        } else {
            dummy = new ListNode(list2.val);
            list2 = list2.next;
        }

        ListNode curr = dummy;

        /* Work through both lists, comparing them as we move through them. */
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                curr.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            curr = curr.next;
        }

        /* Empty potentially non-empty list1 */
        while (list1 != null) {
            curr.next = new ListNode(list1.val);
            list1 = list1.next;
            curr = curr.next;
        }

        /* Empty potentially non-empty list2 */
        while (list2 != null) {
            curr.next = new ListNode(list2.val);
            list2 = list2.next;
            curr = curr.next;
        }

        return dummy;
    }
}
