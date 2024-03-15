class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int correct = 0;
        int zero = 0;
        // 순위: 6-당첨개수+1
        for ( int i = 0; i < lottos.length; i++ ) {
            if ( lottos[i] == 0 ) {
                zero++;
                continue;
            }
            for ( int j = 0; j < win_nums.length; j++ ) {
                if( lottos[i] == win_nums[j] ) {
                    correct++;
                    break;   
                }
            }
        }
        answer[0] = (6-((correct+zero) == 0 ? 1: (correct+zero)))+1;
        answer[1] = (6-(correct <= 1 ? 1 : correct))+1;
        // [1, 2, 3, 4, 5, 6] [7, 8, 9, 10, 11, 12] [6,6]
        return answer;
    }
}