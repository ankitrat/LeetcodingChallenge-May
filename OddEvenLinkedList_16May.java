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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        
        ListNode curr = head;
        ListNode next = curr.next;
        ListNode newHead = next;
        
        while(curr.next!=null && next.next!=null) {
            curr.next = next.next;
            curr=curr.next;
            next.next = curr.next;
            next = next.next;
           
        }
        curr.next = newHead;
        curr=null;
        newHead = null;
        next=null;
        return head;
    }
}