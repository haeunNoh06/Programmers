class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[end-start+1];
        int index = start;
        for  (int i = 0; i < answer.length; i++)
            answer[i] = index+i;
        answer[answer.length-1] = end;
        return answer;
    }
} 