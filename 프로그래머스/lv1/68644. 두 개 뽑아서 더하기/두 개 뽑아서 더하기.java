class Solution {
    public int[] solution(int[] numbers) {
        int[] sum = new int[numbers.length*numbers.length-numbers.length];
        int idx = 0;
        for ( int i = 0; i < numbers.length; i++) {
            for ( int j = 0; j < numbers.length; j++) {
                if ( i != j )
                    sum[idx++] = numbers[i] + numbers[j];
            }
        }
        for ( int i = 0; i < sum.length; i++) {
            for ( int j = 1; j < sum.length; j++) {
                if ( sum[j-1] > sum[j] ) {
                    int tmp = sum[j-1];
                    sum[j-1] = sum[j];
                    sum[j] = tmp;
                }
            }
        }
        int std = sum[0];
        int cnt = 0;
        for ( int i = 1; i < sum.length; i++) {
            if ( std != sum[i]) {
                cnt++;
                std = sum[i];
            }
        }
        int[] answer = new int[cnt+1];
        answer[0] = sum[0];
        idx = 1;
        for ( int i = 0; i < sum.length; i++) {
            if ( answer[idx-1] != sum[i]) {
               answer[idx++] = sum[i];
            }
        }
        return answer;
    }
}