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
     * @param head: ListNode head is the head of the linked list 
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // write your code here
        if (m>=n || head == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        ListNode mpre = dummy;
        for(int i = 0; i < n;i++){
            if (m != 1 && i == m-1){
                mpre = head;
            }
            head = head.next;
        }
        
        ListNode nm = mpre.next;
        ListNode pre = mpre;
        ListNode curt = nm;
        ListNode nn = head;
        ListNode nplus = head.next;
        while (curt != nplus){
            ListNode temp = curt.next;
            curt.next = pre;
            pre = curt;
            curt = temp;
            }
        nm.next = nplus;
        mpre.next = nn;
        return dummy.next;
        }
    }