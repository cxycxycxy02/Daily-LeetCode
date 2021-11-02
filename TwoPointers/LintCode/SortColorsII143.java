public class Solution {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
    public void sortColors2(int[] colors, int k) {
        // write your code here
        if(colors == null || colors.length == 0|| k <= 0){
            return ;
        }
        int left = 0;
        for(int i = 0;i < k; i++){
            int j = 0;
            while (j < colors.length){
                if (colors[j] == i+1){
                    colors[j] = colors[left];
                    colors[left] = i+1;
                    left ++;
                    j ++;
                }else{
                    j++;
                }
            }
        }
    }
}