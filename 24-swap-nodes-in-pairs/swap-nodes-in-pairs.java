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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode d1 = new ListNode(-1); // Odd list dummy
        ListNode d2 = new ListNode(-1); // Even list dummy
        ListNode t1 = d1;
        ListNode t2 = d2;
        ListNode t = head;
        int count = 1;
        
        // 1. Separate into two lists
        while (t != null) {
            if (count % 2 != 0) { // odd
                t1.next = t;
                t1 = t1.next;
            } else { // even
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
            count++;
        }
        
        // CRITICAL FIX 1: Disconnect the tails to prevent cyclic loops
        t1.next = null;
        t2.next = null;

        // Reset pointers for merging
        t1 = d1.next; // Head of odds (e.g., 1 -> 3)
        t2 = d2.next; // Head of evens (e.g., 2 -> 4)
        
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        // 2. Correctly merge them alternatively (Even first, then Odd)
        while (t1 != null || t2 != null) {
            if (t2 != null) {
                current.next = t2;     // Link the even node
                t2 = t2.next;          // Move even pointer safely
                current = current.next;// Move merged list pointer
            }
            if (t1 != null) {
                current.next = t1;     // Link the odd node
                t1 = t1.next;          // Move odd pointer safely
                current = current.next;// Move merged list pointer
            }
        }
        
        return dummy.next;
    } 
}
