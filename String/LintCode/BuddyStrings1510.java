public class Solution {
    /**
     * @param A: string A
     * @param B: string B
     * @return: bool
     */
    public boolean buddyStrings(String A, String B) {
        // Write your code here
        if (A == null && B == null){
            return true;
        }
        if (A == null || B == null || A.length() != B.length()){
            return false;
        }
        int first = -1;
        int second = -1;
        for (int i = 0; i< A.length();i++){
            if (A.charAt(i) != B.charAt(i)){
                if(first != -1){
                    if (second == -1){
                        second = i;
                    }else{
                        return false;
                    }
                }else{
                    first = i;
                }
            }
        }
        if (first == -1 || second == -1){
            Set<Character> s = new HashSet<Character>();
            for (char c : A.toCharArray()) {
                s.add(c);
            }
            return s.size() < A.length();

        }
        if (A.charAt(second) == B.charAt(first) && A.charAt(first) == B.charAt(second)){
            return true;
        }
        return false;

    }
}