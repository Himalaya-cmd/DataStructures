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
    // 1     2     3     4
    //      prev   curr
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode prev = head;
        ListNode curr = head.next;
        head.next = null;
        while(curr!=null){
            ListNode temp = curr.next; // temp = 4
            curr.next = prev; // 3->2->1
            prev = curr; // prev = 2
            curr=temp; // curr = 3
        }
        return prev;
    }
}