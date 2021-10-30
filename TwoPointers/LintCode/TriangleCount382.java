public class Solution {
    /**
     * @param S: A list of integers
     * @return: An integer
     */
    public int triangleCount(int[] S) {
        // write your code here
        if (S == null || S.length < 3){
            return 0;
        }
        Arrays.sort(S);
        int count = 0;
        for (int i = S.length-1 ;i >=2;i--){
            int target = S[i];

            int left = 0; int right = i-1;
            count = count+ findTriangle(S,left,right,target);
        }
        return count;
    }
    public int findTriangle(int[] S,int left,int right,int target){
        int count = 0;
        while (left<right){
            if (S[right]+S[left]>target){
                count += right -left;
                right --;
            }else{
                left++;
            }
        }
        return count;
    }

}