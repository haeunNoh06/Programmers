class Solution
{
    public int solution(String s)
    {
        int answer = 1;

        for ( int i = 0; i < s.length(); i++ ) {
            answer = Math.max(answer, getPalindrome(s, i, i+1));
            answer = Math.max(answer, getPalindrome(s, i-1, i+1));
        }
        return answer;
    }
    
    private int getPalindrome(String s, int st, int en) {
        
        while( st >= 0 && en < s.length() && s.charAt(st) == s.charAt(en) ) {
            st--;
            en++;
        }
        while ( st == -1 && en < s.length() && s.charAt(st+1) == s.charAt(en)) {
            en++;
        }
        while ( en == s.length() && st >= 0 && s.charAt(st) == s.charAt(en-1)) {
            st--;
        }
        
        return en - st - 1;
    }
}