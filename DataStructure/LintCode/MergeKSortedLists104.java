/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */


    private Comparator<ListNode> listNodeComparator = new Comparator<ListNode>(){
        public int compare(ListNode l1,ListNode l2){
            return l1.val - l2.val;
        }
    };
    public ListNode mergeKLists(List<ListNode> lists) {
        // write your code here
        if(lists == null || lists.size() == 0 ){
            return null;
        }
        Queue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(),listNodeComparator);
        for(int i = 0;i<lists.size();i++){
            if(lists.get(i) != null){
                heap.offer(lists.get(i));
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(!heap.isEmpty()){
            ListNode head = heap.poll();
            tail.next = head;
            tail = tail.next;
            if (head.next !=null){
                heap.offer(head.next);
            }
        }
        return dummy.next;
    }
}
