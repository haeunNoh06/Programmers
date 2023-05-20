class Solution {
    public int solution(String t, String p) {
        int cnt = 0;
        int pLen = p.length();
        for ( int i = 0; i < t.length()-pLen+1; i++) {
            String str = t.substring(i, i+pLen);
            if ( Long.parseLong(str) <= Long.parseLong(p) )
                cnt++;
        }
        return cnt;
    }
}