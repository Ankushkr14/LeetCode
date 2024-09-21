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
    private ListNode find(ListNode head, int k ){
        int cnt = 1;
        while(head != null){
            if(cnt == k){
                return head;
            }
            cnt++;
            head = head.next;
        }
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int l = 1;
        ListNode tail = head;

        while(tail.next != null){
            l++;
            tail = tail.next;
        }
        if(k%l==0){
            return head;
        }
        k=k%l;
        tail.next = head;
        ListNode newLastNode = find(head,l-k);
        ListNode newHead = newLastNode.next;
        newLastNode.next = null;
        return newHead;
    }
}