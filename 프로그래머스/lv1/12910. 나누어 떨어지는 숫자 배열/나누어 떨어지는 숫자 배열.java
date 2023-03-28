import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer;
        int cnt = 0;
        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i] % divisor == 0) cnt++;
        }
        if ( cnt >= 1) answer = new int[cnt];
        else {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int j = 0;
        for ( int i = 0 ; i < arr.length; i++) {
            if ( arr[i] % divisor == 0) answer[j++] = arr[i];
        }
        Arrays.sort(answer);
        return answer;
    }
}