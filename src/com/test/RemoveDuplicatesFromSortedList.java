package com.test;

public class RemoveDuplicatesFromSortedList {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Function to remove duplicates from sorted list
    public static ListNode removeDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                // Skip duplicate node
                current.next = current.next.next;
            } else {
                // Move to next unique element
                current = current.next;
            }
        }

        return head;
    }

    // Helper to build a linked list from array
    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

    // Helper to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int[] data = {1, 1, 2, 3, 3, 4, 4, 4, 5};
        ListNode head = buildList(data);

        System.out.print("Original list: ");
        printList(head);

        ListNode result = removeDuplicates(head);

        System.out.print("List after removing duplicates: ");
        printList(result);
    }
}
