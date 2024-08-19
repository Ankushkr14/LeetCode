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

    public ListNode reverse(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        if(head.next == null && n ==1){
            return null;
        }
        

        ListNode newHead = reverse(head);
        ListNode current = newHead;
        if(n==1){
            newHead = newHead.next;
        }else{
            for(int i =1; i<n-1;i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
        head = reverse(newHead);
        return head;
    }
}