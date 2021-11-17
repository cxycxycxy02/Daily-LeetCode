public class Solution {
    /**
     * @param letters: A string
     * @return: A string
     */
    public String lowercaseToUppercase2(String letters) {
        // write your code here
        if (letters == null || letters ==""){
            return letters;
        }
        StringBuffer sb = new StringBuffer(letters);
        for(int i = 0;i < letters.length();i++){
            char c = sb.charAt(i);
            if (Character.isLowerCase(c)){
                sb.setCharAt(i, Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}