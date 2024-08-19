/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode temp = head;
        int i = 0;
    
        while(temp !=null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp, i++);
            temp = temp.next;
        }
        return null;

    }
}