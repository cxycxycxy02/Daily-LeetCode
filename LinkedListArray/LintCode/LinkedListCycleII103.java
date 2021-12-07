/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: The first node of linked list.
     * @return: The node where the cycle begins. if there is no cycle, return null
     */
    public ListNode detectCycle(ListNode head) {
        // write your code here
        if(head == null||head.next == null){
            return null;
        }
        ListNode slow,fast;
        slow = head;
        fast = head.next;
        while(fast != slow){
            if(fast == null || fast.next == null){
                return null;
            }         
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = head;
        while(slow != fast.next){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

}