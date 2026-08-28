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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int c=0;
        ListNode d=new ListNode(0);
        ListNode temp=d;
        while(l1!=null || l2!=null || c!=0){
            int  n=c;c=0;
            if(l1!=null){
                n+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                n+=l2.val; 
                l2=l2.next;
            }
            if(n>9){
                int num=n;
                n=n%10;
                c=num/10;
            }
            ListNode k=new ListNode(n);
            temp.next=k;
            temp=temp.next;
            
        }
      
        return d.next;
    }
}