class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        for ( int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ( ch == ' ') {
                answer += ch;
                cnt = 0;
                continue;
            }
            if ( cnt % 2 == 0) {
                if ( ch >= 'a') {
                    answer += (char)(ch - 32);
                } else {
                    answer += ch;
                }
            } else {
                if ( ch <= 'Z') {
                    answer += (char)(ch+32);
                    System.out.println(answer);
                } else {
                    answer += ch;
                }
            }
            
            cnt++;
        }
        
        return answer;
    }
}