class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = (m <= n ? m : n);
        
        // 최소공약수 구하기
        for ( int i = 1; i <= min; i++) 
            if ( m % i == 0 && n % i == 0)
                answer[0] = i;
        
        // 최소공배수 구하기
        answer[1] = m*n / answer[0];
        
        return answer;
    }
}