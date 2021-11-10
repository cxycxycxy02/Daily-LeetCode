public class Solution {
    /*
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> subarraySum(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null ||nums.length == 0){
            return result;
        }
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 0);
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = sum + nums[i];
            if (sumMap.containsKey(sum)){
                result.add(sumMap.get(sum));
                result.add(i);
                return result;
            }
            sumMap.put(sum,i+1);
        }return result;
    }
}