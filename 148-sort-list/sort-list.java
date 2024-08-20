/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        fast = fast.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        return mid;
    }

    private ListNode merge(ListNode leftHead, ListNode rightHead) {
        ListNode newHead = new ListNode(0); // Dummy node to help with merging
        ListNode current = newHead;

        while (leftHead != null && rightHead != null) {
            if (leftHead.val < rightHead.val) {
                current.next = leftHead;
                leftHead = leftHead.next;
            } else {
                current.next = rightHead;
                rightHead = rightHead.next;
            }
            current = current.next;
        }
        if(leftHead!=null){
            current.next=leftHead;
        }
        if(rightHead!=null){
            current.next=rightHead;
        }
        return newHead.next;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid=findMid(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);

        return merge(left, right);
    }
}