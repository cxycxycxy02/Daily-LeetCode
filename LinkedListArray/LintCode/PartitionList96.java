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
     * @param head: The first node of linked list
     * @param x: An integer
     * @return: A ListNode
     */
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if (head == null){
            return null;
        }
        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy = new ListNode(0);
        ListNode right = rightDummy;
        ListNode left = leftDummy;
        while(head!= null){
            if (head.val < x ){
            left.next = head;
            left = left.next;
        }else{
            right.next = head;
            right = right.next;           
            }
            head = head.next;
    }
        left.next = rightDummy.next;
        right.next = null;
        return leftDummy.next;
}
}