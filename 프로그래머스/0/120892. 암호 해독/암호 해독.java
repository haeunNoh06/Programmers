class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int i = -1;
        for ( String s : cipher.split("") ) {
            i++;
            if ( (i+1) % code != 0 ) continue;
            answer += s;
        }
        return answer;
    }
}