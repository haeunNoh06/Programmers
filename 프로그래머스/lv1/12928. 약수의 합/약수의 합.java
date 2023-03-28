class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for ( int i = 1; i <= n; i++ ) { //제곱근을 구하는 함수
            if ( n % i == 0 )
                answer+=i;
        }
        
        return answer;
    }
}