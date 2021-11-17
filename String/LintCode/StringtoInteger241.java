public class Solution {
    /**
     * @param target: A string
     * @return: An integer
     */
    public int stringToInteger(String target) {
        // write your code here
        int result = 0;
        int Minus = 0;

        if ('-' == target.charAt(0)){
            Minus = 1;
        }
        for (int i = Minus; i<target.length();i++){
            result = result*10 + target.charAt(i) - '0';
        }

        return Minus == 0 ? result:-result;
    }
}