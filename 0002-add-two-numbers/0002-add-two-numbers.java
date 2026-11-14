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
        if(l1==null && l2!=null)return l2;
        if(l1!=null && l2==null)return l1;
        if(l1==null && l2==null)return null;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head=null,curr=null;
        int carry = 0;
        while(temp1!=null && temp2!=null){
            int num = temp1.val + temp2.val + carry;
            int takethis = num;
            if(num>9){ 
                takethis = num%10;
                carry = num/10; 
            }else{
                carry=0;
            }
            if(curr==null){
                head = new ListNode(takethis);
                curr = head; 
            }else{
                ListNode nyanode = new ListNode(takethis);
                curr.next = nyanode;
                curr = nyanode;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1!=null){
            int num = temp1.val + carry;
            int takethis = num;
            if(num>9){ 
                takethis = num%10;
                carry = num/10; 
            }else{
                carry=0;
            }
            ListNode nyanode = new ListNode(takethis);
            curr.next = nyanode;
            curr = nyanode;
            temp1=temp1.next;
        }
        while(temp2!=null){
            int num = temp2.val + carry;
            int takethis = num;
            if(num>9){ 
                takethis = num%10;
                carry = num/10; 
            }else{
                carry=0;
            }
            ListNode nyanode = new ListNode(takethis);
            curr.next = nyanode;
            curr = nyanode;
            temp2=temp2.next;
        }
        if(carry!=0){
            ListNode nyanode = new ListNode(carry);
            curr.next = nyanode;
            curr = nyanode;
        }
        return head;
    }
}