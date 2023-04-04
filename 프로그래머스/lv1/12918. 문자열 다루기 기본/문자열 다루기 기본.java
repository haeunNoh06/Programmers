class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        char ch;
        if ( s.length() == 4 || s.length() == 6 ) {
            for ( int i = 0; i < s.length(); i++ ) {
                ch = s.charAt(i);
                if (ch >= 'A') {
                    answer = false;
                    break;
                }
            }
        }
        else
            return false;
        return answer;
    }
}