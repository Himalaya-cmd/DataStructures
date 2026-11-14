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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        Stack<ListNode> st = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode curr = slow; 
        if(fast!=null){
           curr = slow.next; 
           slow.next=null;
        }
        // ListNode prev = null;
        // ListNode curr = slow;
        // while(curr!=null){
        //     ListNode temp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = temp;
        // }
        while(curr!=null){
            st.push(curr);
            curr=curr.next;
        }
        while(head!=null && !st.isEmpty()){
            ListNode nikalo = st.pop();
            // System.out.println(nikalo.val);
            if(head.val!=nikalo.val)return false;
            head = head.next;
        }
        if(head==null && st.isEmpty())return true;
        // System.out.println(head.val);
        if(head.next==null && st.isEmpty())return true;
        return false;
    }
}