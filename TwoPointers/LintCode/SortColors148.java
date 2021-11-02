public class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0){
            return;
        }
        int middle = 0;
        int left = 0;
        int right = nums.length -1;
        while (middle <= right){
            if (nums[middle] == 0){
                nums[middle] = nums[left];
                nums[left] = 0;
                middle ++;
                left ++;
            }else if (nums[middle] == 2){
                nums[middle] = nums[right];
                nums[right] = 2;
                right --;
            }else{
                middle ++;
            }
        }
    }

}