import java.util.Arrays;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] failPer = new int[N+2];
        int[] player = new int[N+2];
        Arrays.sort(stages);
        for ( int i = 0; i < stages.length; i++) {
            failPer[stages[i]]++;
            player[stages[i]]++;
        }
        //return failPer;
        return player;
    }
}