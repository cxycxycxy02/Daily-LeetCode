public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        if(s == null || s.length() == 0){
            return "";
        }
        String[] charc = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = charc.length-1;i>=0;i--){
            if (!charc[i].equals("")){
                if (sb.length() > 0 ){
                    sb.append(" ");
                }
                sb.append(charc[i]);
            }}
        return sb.toString();
    }
}