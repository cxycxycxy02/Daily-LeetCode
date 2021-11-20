public class Solution {
    /**
     * @param s: the string
     * @return: length of longest semi alternating substring
     */
    public int longestSemiAlternatingSubstring(String s) {
        // write your code here
        if (s == null || s.length()== 0 ){
            return 0;
        }
        if (s.length() <= 3){
            return s.length();
        }
        int res = 1;
        int duplicated = 1;
        for (int left = 0, right = 1;right<s.length();right++){
            if (s.charAt(right) == s.charAt(right-1)){
                duplicated += 1;
            }else{
                duplicated = 1;
            }
            if (duplicated == 3){
                left = right - 1;
                duplicated = 2;
            }
            res = Math.max(res, right - left + 1 );
        }
        return res;
    }
}