public class Solution {
    /**
     * @param k: An integer
     * @param nums: An integer array
     * @return: kth smallest element
     */
    public int kthLargestElement(int k, int[] nums) {
        // write your code here
        if (nums == null) {
            return -1;
        }

        return quickSelect(nums.length+1 - k, nums, 0, nums.length - 1);
    }

    private int quickSelect(int k, int[] nums, int begin, int end) {
        if (begin == end) {
            return nums[begin];
        }

        int left = begin, right = end;
        int pivot = nums[(left + right) / 2];
        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }
        }

        if (begin + k - 1 <= right) {
            return quickSelect(k, nums, begin, right);
        }
        if (begin + k - 1 >= left) {
            return quickSelect(k - left + begin, nums, left, end);
        }
        return nums[right + 1];
    }
}