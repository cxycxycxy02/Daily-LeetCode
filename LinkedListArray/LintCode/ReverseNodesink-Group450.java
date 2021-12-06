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
     * @param head: a ListNode
     * @param k: An integer
     * @return: a ListNode
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        // write your code here
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        while(true){
            head = reverseK(head, k);
            if (head == null){
                break;
            }

        }
        return dummy.next;
    }
    public ListNode reverseK(ListNode head, int k) {
        ListNode nk = head;
        for(int i = 0; i < k;i++){
            if (nk == null){
                return null;
            }
            nk = nk.next;
        }
        if (nk == null){
            return null;
        }
        ListNode nk1 = nk.next;
        ListNode n1 = head.next;
        ListNode pre = null;
        ListNode curt = n1;
        while (curt != nk1){
            ListNode temp = curt.next;
            curt.next = pre;
            pre = curt;
            curt = temp;
       }
       n1.next = nk1;
       head.next = nk;
       return n1;
    }
}