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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)return null;
        int c=0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        int key = c-n;
        System.out.println(key);
        ListNode demo = head;
        while(key>1){
            demo=demo.next;
            key--;
        }
        if(key==0){
            head=head.next;
            return head;
        }
        // System.out.println(demo.val);
        if(demo.next!=null && demo.next.next==null){
            demo.next=null;
        }  else if(demo.next!=null && demo.next.next!=null){
            demo.next = demo.next.next;
        }
        return head;
    }
}