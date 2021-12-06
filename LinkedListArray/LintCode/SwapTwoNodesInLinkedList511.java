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
     * @param v1: An integer
     * @param v2: An integer
     * @return: a new head of singly-linked list
     */
    public ListNode swapNodes(ListNode head, int v1, int v2) {
        // write your code here
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(Integer.MAX_VALUE);
        dummy.next = head;
        head = dummy;
        ListNode v1Pre = null;
        ListNode v2Pre = null;
        while (head.next!= null ){
            if (head.next.val == v1){
                v1Pre = head;
            }
            if (head.next.val == v2){
               v2Pre = head;
            }            
            head = head.next;
        }
        if(v1Pre == null || v2Pre == null){
            return dummy.next;
        }
        ListNode v1Node = v1Pre.next;
        ListNode v2Node = v2Pre.next;
        v1Pre.next = v2Pre.next;
        v2Pre.next = v1Node;
        ListNode temp = v1Node.next;
        v1Node.next = v2Node.next;
        v2Node.next = temp;
    return dummy.next;
    }
    

}