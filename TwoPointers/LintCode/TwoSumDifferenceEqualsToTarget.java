public class Solution {
    /**
     * @param nums: an array of Integer
     * @param target: an integer
     * @return: [num1, num2] (num1 < num2)
     */
    public int[] twoSum7(int[] nums, int target) {
        // write your code here
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }
        int slow = 0;
        int fast = 1;
        target = Math.abs(target);
        while (fast<nums.length){
            while (slow<fast-1 && nums[fast] - nums[slow]>target){
                slow++;
            }
            if (nums[fast] - nums[slow] == target){
                return new int[]{nums[slow],nums[fast]};
            }
            fast++;
        }
        return new int[]{};
    }
}