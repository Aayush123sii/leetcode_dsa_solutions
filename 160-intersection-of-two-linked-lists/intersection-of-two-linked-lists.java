/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1=headA;
        ListNode t2=headB;
        int s1=0,s2=0;
        while(t1!=null){
            s1++;
            t1=t1.next;
        }
        while(t2!=null){
            s2++;
            t2=t2.next;
        }
        t1=headA;
        t2=headB;
        for (int i=1;i<=Math.abs(s1-s2);i++){
            if(s1>s2) t1=t1.next;
            else t2=t2.next;
            }
            while(t1!=null){
                if(t1==t2) return t1;
             t1=t1.next;
             t2=t2.next;
        }
        return null;
    }
}