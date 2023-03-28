class Solution {
    public long solution(long n) {
        long answer = 0;
      
        for ( long x = 1L; x <= Math.sqrt(n); x++ ) {   //n의 제곱근까지 반복
            //x제곱이 n이면 (x+1)*(x+1)을 answer에 저장
            answer = ( x*x == n ? (x+1)*(x+1) : -1);
        }
        
        return answer;
    }
}