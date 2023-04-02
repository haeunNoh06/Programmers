import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        
        // 정렬
        //Arrays.sort(d);
        for ( int i = 0; i < d.length; i++) {
            for ( int j = 1; j < d.length-i; j++) {
                if (d[j-1] > d[j]) {
                    int tmp = d[j-1];
                    d[j-1] = d[j];
                    d[j] = tmp;
                }
            }
        }
        
        int sum = 0, cnt = 0;
        for ( int i = 0; i < d.length; i++) {
            sum += d[i];
            if ( sum > budget ) break;
            cnt++;
        }
        
        return cnt;
    }
}