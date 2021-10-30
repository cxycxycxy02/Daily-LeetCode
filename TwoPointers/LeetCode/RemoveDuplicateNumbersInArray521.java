public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        // write your code here
        if(nums ==null || nums.length ==0){
            return 0;
        }
        Arrays.sort(nums);
        int fast = 0;
        int slow = 0;
        while (fast<nums.length){
            if(nums[slow]!=nums[fast]){
                slow++;
                nums[slow] =nums[fast];

            }
            fast++;
        }
        return slow+1;
    }
}