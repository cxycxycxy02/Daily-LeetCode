/**
time o(nlogn)
space o(n)
容易错 继承 Comparable<Pair>
*/
public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1, index2] (index1 < index2)
     */
     class Pair implements Comparable<Pair> {
        int number,position;
        public Pair(int number, int position){
            this.number = number;
            this.position = position;
        }
        public int compareTo(Pair other) {
            return number - other.number;
        }
    }
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int[] result = new int[2];
        if (numbers == null || numbers.length == 0){
            return result;
        }
        Pair[] pairs = getSortedPairs(numbers);
        int left = 0,right = numbers.length-1;
        while (left < right){
            if (pairs[left].number + pairs[right].number < target){
                left++;
            }
            else if (pairs[left].number + pairs[right].number > target){
                right--;
            }else{
                result[0] = Math.min(pairs[left].position,pairs[right].position);
                result[1] = Math.max(pairs[left].position,pairs[right].position);
                return result;
                }
        }
        return result;

    }
    private Pair[] getSortedPairs(int[] numbers){
        Pair[] pairs = new Pair[numbers.length];
        for (int i = 0;i< numbers.length;i++){
            pairs[i] = new Pair(numbers[i],i);
        }
        Arrays.sort(pairs);
        return pairs;
    }


}