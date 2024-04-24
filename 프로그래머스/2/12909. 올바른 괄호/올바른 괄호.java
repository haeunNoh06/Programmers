class Solution {
    boolean solution(String s) {
        
        int balance = 0;
        
        for ( char c : s.toCharArray() ) {
            if ( c == '(') {
                balance++;
            } else {
                balance--;
                if ( balance < 0 ) return false;
            }
        }
        return (balance == 0 ? true : false);
    }
}