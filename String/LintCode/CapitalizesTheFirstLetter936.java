public class Solution {
    /**
     * @param s: a string
     * @return: a string after capitalizes the first letter
     */
    public String capitalizesFirst(String s) {
        // Write your code here
        if(s == null || s.length() == 0){
            return s;
        }
        char[] sChar = s.toCharArray();
        if(sChar[0] >= 'a' && sChar[0] <='z'){
            sChar[0]-= 32;
        }
        for(int i = 1; i<s.length();i++){
            if(sChar[i-1] == ' ' && sChar[i] != ' '){
                sChar[i]-= 32;
            }
        }
        return String.valueOf(sChar);
    }
}