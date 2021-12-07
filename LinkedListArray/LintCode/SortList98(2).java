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
        ListNode dummyLeft = new ListNode(0) ,leftTail =  dummyLeft ;
        ListNode dummyMiddle = new ListNode(0),middleTail = dummyMiddle;
        ListNode dummyRight = new ListNode(0), rightTail = dummyRight;
        ListNode middle = findMiddle(head);
        dummyMiddle.next = middle;
        while(head !=null){
            if (head.val < middle.val ){
                leftTail.next = head;
                leftTail = leftTail.next;
            }else if (head.val > middle.val ){
                rightTail.next = head;
                rightTail = rightTail.next;
            }else{
                middleTail.next = head;
                middleTail = middleTail.next;
            }
            head = head.next;
        }
        leftTail.next = null;
        middleTail.next = null;
        rightTail.next = null;

        ListNode left = sortList(dummyLeft.next);
        ListNode right = sortList(dummyRight.next);
        return concat(left,dummyMiddle.next,right);     
    }
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = slow.next;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    private ListNode concat(ListNode left, ListNode middle, ListNode right) {
        ListNode dummy = new ListNode(0), tail = dummy;
        
        tail.next = left; tail = toTail(tail);
        tail.next = middle; tail = toTail(tail);
        tail.next = right; tail = toTail(tail);
        return dummy.next;
    }
    public ListNode toTail(ListNode head){
        if (head == null){
            return null;
        }
        while (head.next != null){
            head = head.next;
        }
        return head;
    }
}