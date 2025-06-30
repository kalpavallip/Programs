package com.test;
	
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to simplify logic
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Merge while both lists are non-empty
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Append the remaining list
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        // List 1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // List 2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode merged = mergeTwoLists(list1, list2);
        System.out.print("Merged List: ");
        printList(merged);
    }
}
