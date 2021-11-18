public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        if (s == null || s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while (i<j){
            while(i<j &&!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(j>i &&!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if (i<j && s.charAt(i)!= s.charAt(j)){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}