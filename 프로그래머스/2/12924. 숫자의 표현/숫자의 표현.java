class Solution {
    public int solution(int n) {
        int answer = 1, sum = 0, init = 1;
        if ( n == 1 ) return 1;
        for ( int i = 1; i <= n/2+1; i++ ) {
            sum += i;
            if ( sum == n ) {
                answer++;
                sum = 0;
                i = ++init;
                continue;
            } else if ( sum > n ) {
                sum = 0;
                i = ++init;
                continue;
            }
        }
        return answer;
    }
}