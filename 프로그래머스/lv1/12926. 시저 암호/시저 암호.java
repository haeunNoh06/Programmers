class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for ( int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ( ch == ' ') {
                answer += " ";
                continue;
            } 
            for ( int j = 0; j < n; j++) {
                if ( ch+j == 'z' || ch+j == 'Z') {
                    ch -= 26;
                    continue;
                }
            }
            answer += (char)(ch+n);
        }
        return answer;
    }
}
