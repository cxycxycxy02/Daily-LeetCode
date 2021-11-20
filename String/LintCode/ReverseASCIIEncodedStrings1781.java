public class Solution {
    /**
     * @param encodeString: an encode string
     * @return: a reversed decoded string
     */
    public String reverseAsciiEncodedString(String encodeString) {
        // Write your code here
        if(encodeString == null || encodeString.length() == 0){
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = encodeString.length()-1;i>= 0;i--){
            if (i>0 && i % 2 == 1){
                int cut = Integer.valueOf(encodeString.substring(i-1, i+1));
                sb.append((char)cut);
            }
        }
        return sb.toString();
    }
}