public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target: An integer
     * @return: return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers, int target) {
        // write your code here
        if (numbers == null|| numbers.length <3){
            return 0;
        }
        Arrays.sort(numbers);
        int sum = Integer.MAX_VALUE;
        for (int i = 0;i < numbers.length-2; i++){
            int left = i+1;
            int right = numbers.length-1;
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            while (left<right){
                int cur = numbers[i]+numbers[left]+numbers[right];
                if (cur == target){
                    return target;
                }
                if (Math.abs(cur - target)<Math.abs(sum - target)){
                    sum = cur;
                }
                if (cur>target){
                    right--;
                    while (left<right && numbers[right] == numbers[right+1]){
                        right--;
                    }
                }else{
                    left ++;
                    while (left<right && numbers[left] == numbers[left-1]){
                        left ++;
                    }
                }

            }

        }
        return sum;
    }
}
