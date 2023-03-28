class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if ( arr.length == 1 ) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        answer = new int[arr.length-1];
        
        int min = arr[0];
        for ( int i : arr ) min = Math.min(i, min);
        
        int j = 0;
        for ( int i : arr ) {
            if ( i == min ) continue;
            answer[j++] = i;
        }
        return answer;
    }
}