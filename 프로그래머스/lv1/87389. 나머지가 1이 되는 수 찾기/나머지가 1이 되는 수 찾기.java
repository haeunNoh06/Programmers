class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int min = n;
        for ( int x = n; x >= 1; x-- ) {
             if ( n % x == 1 ) {
                    if ( x < min)min = x;
            }
       }
        answer = min;
        return answer;
    }
}
