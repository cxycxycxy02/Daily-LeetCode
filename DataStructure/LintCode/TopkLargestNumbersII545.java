public class Solution {
    private Queue<Integer> heap;
    private Integer k;
    /*
     * @param k: An integer
     */public Solution(int k) {
        // do intialization if necessary
        heap = new PriorityQueue<Integer>();
        this.k= k;
    }

    /*
     * @param num: Number to be added
     * @return: nothing
     */
    public void add(int num) {
        if(heap.size()<k){
            heap.offer(num);
            return;
        }
        // write your code here
        if(num>heap.peek()){
            heap.offer(num);
            heap.poll();
        }
    }

    /*
     * @return: Top k element
     */
    public List<Integer> topk() {
        // write your code here
        List<Integer> result = new ArrayList<>();
        Iterator it = heap.iterator();
        while(it.hasNext()){
            result.add((Integer)it.next());
        }
        Collections.sort(result,Collections.reverseOrder());
        return(result);
    }
}