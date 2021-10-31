//令狐老师小视频的模板代码.
//        partition的quick select算法.
//        注意, 此题和quick sort有些不同.
//        如果start == end, 证明已经找到, return nums[start]即可.
//        如果while的判断是left<=right. 则有可能在partition后right和left之间有一个数.
//        因此, 我们要做出相应的判断和改变. partition后看三个区间.
//        第一个区间是从start到right, 如果k在这个范围, 即start + k - 1 <= right, 继续在这个范围找k个数.
//        第二个区间是从left到end, 如果k在这个范围, 即start + k - 1 >= left. 要在这个范围找k-(left - start)个数.
//        或者k在right和left之间.这里面只有一个数, 那么return nums[right + 1]即可.
//        注意, 此题是找第k个小的数, 因此partition里要变换为nums[left] < pivot 跳过, nums[right] > pivot跳过.
public class Solution {
    /**
     * @param k: An integer
     * @param nums: An integer array
     * @return: kth smallest element
     */
    public int kthSmallest(int k, int[] nums) {
        // write your code here
        if (nums == null) {
            return -1;
        }

        return quickSelect(k, nums, 0, nums.length - 1);
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