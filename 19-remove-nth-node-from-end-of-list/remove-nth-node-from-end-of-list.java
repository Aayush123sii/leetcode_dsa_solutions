class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node that points to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        // Move fast so there is a gap of n nodes between fast and slow
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // Move both pointers until fast reaches the end of the list
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // Skip the nth node from the end
        slow.next = slow.next.next;
        
        // Return the actual head
        return dummy.next;
    }
}
