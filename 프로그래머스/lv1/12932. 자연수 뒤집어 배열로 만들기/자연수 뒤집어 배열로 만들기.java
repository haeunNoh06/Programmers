class Solution {
    public long[] solution(long n) {
        
        //숫자를 문자열로 변환
        String str = String.valueOf(n);
        
        //문자열 길이만큼 배열 생성
        long[] answer = new long[str.length()];
        
        for ( int i = 0; i < str.length(); i++ ) {
            answer[i] = n % 10;
            n /= 10;
        }
        return answer;
    }
}