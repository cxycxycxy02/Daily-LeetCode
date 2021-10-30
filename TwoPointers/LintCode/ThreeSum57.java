// time o(n)o(n)
// space o(n)
public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        List<List<Integer>> result = new ArrayList<>();
        if (numbers == null || numbers.length <3){
            return result;
        }
        Arrays.sort(numbers);
        for (int i = 0;i < numbers.length-2;i++){
            if (i>0 && numbers[i] == numbers[i-1]){
                continue;
            }
            int target = -numbers[i];
            int left = i+1;
            int right = numbers.length - 1;
            twoSum(numbers,left,right,target,result);
        }
        return result;
    }
    public void twoSum(int[] numbers,int left,int right,int target,List<List<Integer>> result) {
        while (left<right){
            if (numbers[left] + numbers[right] == target){
                List<Integer> subResult =  new ArrayList<>();
                subResult.add(-target);
                subResult.add(numbers[left]);
                subResult.add(numbers[right]);
                result.add(subResult);
                left ++;
                right --;
                while (left<right && numbers[left] == numbers[left-1]){
                    left++;
                }
                while (left<right && numbers[right] == numbers[right+1]){
                    right--;
                }
            }else if (numbers[left] + numbers[right] <= target){
                left++;
            }else{
                right--;
            }
        }
    }
}