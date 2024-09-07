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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> hash = new HashSet<>();
        for (int it : nums) {
            hash.add(it);
        }
        
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode c = d;
        
        while (c.next != null) {
            if (hash.contains(c.next.val)) {
                c.next = c.next.next;
            } else {
                c = c.next;
            }
        }
        
        return d.next;
    }
}