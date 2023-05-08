import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0, cnt = 0;
        for ( int i = 0; i < d.length; i++) {
            sum += d[i];
            if ( sum > budget ) break;
            cnt++;
        }
        
        return cnt;
    }
}