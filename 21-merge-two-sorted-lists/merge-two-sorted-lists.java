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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     ListNode dummy=new ListNode(-1);
     ListNode temp=dummy;
     ListNode i=list1;
     ListNode j=list2;
     if(i==null){
        while(j!=null){
         temp.next=j;
            j=j.next;
            temp=temp.next;
            return dummy.next;
     }
     }
     if(j==null){
        while(i!=null){
         temp.next=i;
            i=i.next;
            temp=temp.next;
            return dummy.next;
     }
     }
     while(i!=null&&j!=null){
        if(i.val<j.val){
            temp.next=i;
            i=i.next;
           
        }
         else if(i.val==j.val){
            temp.next=i;
            temp=temp.next;
             i=i.next;
            temp.next=j;
            
             j=j.next;
            
        }
        else{
             temp.next=j;
            j=j.next;
           
        }
        temp=temp.next;
     }   
     while(i!=null){
         temp.next=i;
            i=i.next;
            temp=temp.next;
     }
     while(j!=null){
         temp.next=j;
            j=j.next;
            temp=temp.next;
     }
     return dummy.next;
    }
}