/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // If the list is empty, return null
        if (head == null) return null;
        
        // Start from the head
        ListNode current = head;
        
        // Iterate through the list
        while (current != null && current.next != null) {
            // If the current value is the same as the next node's value, skip the next node
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                // Otherwise, move to the next node
                current = current.next;
            }
        }
        
        return head;  // Return the modified list
    }
}
//