class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;            //약수의 개수
        
        for ( int i = left ; i <= right; i++ ) {
            for ( int j = 1; j <= i/2; j++) {       //약수 구하기
                if ( i % j == 0) cnt++;                 //약수 개수 누적하기
            }
            answer += ( cnt % 2 == 0 )? -i : i;         //약수의 개수가 짝수면 더하고 반대
            cnt = 0;
        }
        return answer;
    }
}