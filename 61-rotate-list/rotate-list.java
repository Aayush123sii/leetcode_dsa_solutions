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
     public int length(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next; // Fixed: moved to next node
        }
        return len;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        
        int n = length(head);
        k %= n;
        if (k == 0) return head;

        ListNode slow = head;
        ListNode fast = head;
        
        // Move fast pointer k+1 steps ahead
        for (int i = 0; i <= k; i++) {
            if (fast == null) return head;
            fast = fast.next;
        }
        
        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode newHead = slow.next;
        slow.next = null;
        ListNode temp = newHead;
        
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        
        return newHead;
    }
}
      
