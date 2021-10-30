public class Solution {
    /**
     * @param nums: an integer array
     * @param target: An integer
     * @return: the difference between the sum and the target
     */
    public int twoSumClosest(int[] nums, int target) {
        // write your code here

        if (nums == null || nums.length < 2){
            return target;
        }
        Arrays.sort(nums);
        int minDifference  = Integer.MAX_VALUE;
        int left = 0;
        int right = nums.length -1;
        while (left < right){
            if (nums[left] + nums[right] > target){
                minDifference = Math.min(minDifference,nums[left] + nums[right] - target);
                right--;
            }else{
                minDifference = Math.min(minDifference,-(nums[left] + nums[right] - target));
                left++;
            }
        }
        return minDifference;
    }
}