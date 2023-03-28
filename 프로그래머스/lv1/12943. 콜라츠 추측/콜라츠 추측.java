class Solution {
    public int solution(int num) {
        long answer = num;
        int cnt = 0;
        
        while ( answer != 1 ) {
            answer = (answer%2==0 ? answer/2 : answer*3+1);
            cnt++;
            if ( answer == 1 ) return cnt;
            if ( cnt == 500 ) return -1;
        }
        return 0;
    }
}