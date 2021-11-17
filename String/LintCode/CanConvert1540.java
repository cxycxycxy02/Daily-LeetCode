public class Solution {
    /**
     * @param s: string S
     * @param t: string T
     * @return: whether S can convert to T
     */
    public boolean canConvert(String s, String t) {
        // Write your code here
        if(s == null && t == null){
            return true;
        }
        if(s == null|| t == null || s.length()<t.length() ){
            return false;
        }
        int b = 0;
        for (int i = 0;i<s.length();i++){
            if (b==t.length()){
                return true;
            }
            if (s.charAt(i) == t.charAt(b)){
                b++;
            }
        }
        return b==t.length()? true:false;

    }
}