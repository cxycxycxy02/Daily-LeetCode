public class Solution {
    /**
     * @param n: An integer
     * @return: return a  integer as description.
     */
    public int nthUglyNumber(int n) {
        // write your code here
        PriorityQueue<Long> heap = new PriorityQueue<Long>();
        heap.add(1L);
        int[] facotrs = new int[]{2,3,5};
        HashSet<Long> seen = new HashSet<Long>();
        seen.add(1L);
        long current = 1;
        long newValue = 1;
        for (int i = 0;i< n; i++){
            current = heap.poll();
            for (int f:facotrs){
                newValue = current * f;
                if (!seen.contains(newValue)){
                    heap.add(newValue);
                    seen.add(newValue);
                }
            }

        }
        return (int)current;
    }}

