import java.lang.Math;
class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        if ( min == max ) return min;
        else {
            for ( int i = min; i <= max; i++ ) {
                sum += i;
            }
        }
        return sum;
    }
}