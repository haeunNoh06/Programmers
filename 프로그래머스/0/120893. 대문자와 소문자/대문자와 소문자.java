class Solution {
    public String solution(String my_string) {
        String answer = "";
        for ( char c : my_string.toCharArray()) {
            answer += c += ( c >= 'a' ? -32 : 32 );
        }
        return answer;
    }
}