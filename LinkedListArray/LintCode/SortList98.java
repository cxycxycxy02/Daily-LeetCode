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
     * @param head: The head of linked list.
     * @return: You should return the head of the sorted linked list, using constant space complexity.
     */
    public ListNode sortList(ListNode head) {
        // write your code here
        if (head == null || head.next == null){
            return head;
        }
        ListNode middle  = findMiddle(head);
        ListNode right = sortList(middle.next);
        middle.next = null;
        ListNode left = sortList(head);
        return merge(left,right);
        
    }
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode merge (ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;        
        while (head1 != null && head2 !=null){
            if (head1.val < head2.val){
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
            if (head1 != null){
                tail.next = head1;
            }else{
                tail.next = head2;
            }
            
        }
        return dummy.next;
    }
}