class Solution {
    public int solution(int order) {
        int answer = 0;
        while ( order != 0 ) {
            if ( ((order % 10)+"").contains("3") ||
                ((order % 10)+"").contains("6") ||
               ((order % 10)+"").contains("9"))
                answer++;
            order /= 10;
        }
        return answer;
    }
}