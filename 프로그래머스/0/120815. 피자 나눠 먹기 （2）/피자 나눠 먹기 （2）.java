class Solution {
    public int solution(int n) {
        int pizzaCnt = 1;
        while (true) {
            if ( (6*pizzaCnt) % n == 0 )
                break;
            pizzaCnt++;
        }
        return pizzaCnt;
    }
}