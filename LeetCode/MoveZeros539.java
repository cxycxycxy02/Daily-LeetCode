public class Solution {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    /time complexity:o(n);
    /space complexity:o(1);

    public void moveZeroes(int[] nums) {
        // write your code here
        if (nums.length ==0){
            return ;
        }
        int fast = 0;
        int slow = 0;
        while(fast<nums.length){
            if(nums[fast]!=0){
                if(nums[slow]==0){
                    nums[slow] = nums[fast];
                    nums[fast] = 0;
                }
                slow++;
            }
            fast ++;
        }
    }
}
