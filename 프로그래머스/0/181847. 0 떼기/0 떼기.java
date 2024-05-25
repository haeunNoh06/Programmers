class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean isNotFirstLeft = false;
        for ( String s : n_str.split("") ) {
            if ( !s.equals("0") )
                isNotFirstLeft = true;
            if ( isNotFirstLeft )
                answer += s;
        }
        return answer;
    }
}