public class Solution {
    /**
     * @param nums: a list of integers.
     * @param k: length of window.
     * @return: the sum of the element inside the window at each moving.
     */
    public int[] winSum(int[] nums, int k) {
        // write your code here
        if(nums.length ==0){
            return new int[0];
        }
        int[] sum = new int[nums.length - k + 1];

        for(int i = 0;i<k;i++){
            sum[0] += nums[i];
        }


        for(int i= 1; i<nums.length-k+1;i++){
            sum[i] = sum[i-1]+nums[i+k-1]-nums[i-1];
        }
        return sum;
    }
}