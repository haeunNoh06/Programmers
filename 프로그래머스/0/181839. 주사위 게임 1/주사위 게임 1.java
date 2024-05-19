class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if ( a % 2 != 0 && b % 2 != 0 )
            return a*a + b*b;
        else if ( a % 2 != 0 || b % 2 != 0 )
            return 2 * ( a + b );
        else {
            answer = a - b;
            return answer = ( answer < 0 ? answer * -1 : answer );
        }
    }
}