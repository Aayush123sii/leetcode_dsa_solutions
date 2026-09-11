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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode head2=slow.next;
        slow.next=null;
        head2 = reverse (head2);
        ListNode i=head;
        ListNode j=head2;
        int sum=0,maxsum=0;
        while(j!=null){
            sum=i.val+j.val;
            if(sum>maxsum) maxsum=sum;
            i=i.next;
            j=j.next;
        }
        return maxsum;
    }
    public ListNode reverse(ListNode head) {
        ListNode c=head;
        ListNode f=null;
        ListNode p=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
    }
}

    

