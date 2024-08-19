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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode temp = head;
        int cnt = 0;

        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        if(cnt == 1){
            return null;
        }

        if(cnt == 2){
            head.next = null;
            return head;
        }
        cnt = cnt/2;
        temp = head;
        int i =0;
        while(temp != null){
            if(i==cnt-1){
                temp.next = temp.next.next;
                break;
            }
            i++;
            temp = temp.next;
        }
        return head;
    }
}