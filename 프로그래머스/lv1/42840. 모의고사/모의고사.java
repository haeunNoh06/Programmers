class Solution {
    public int[] solution(int[] answer) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int[] score = new int[3];
        
        //맞춘 갯수 구하기
        for(int i=0; i < answer.length; i++ ) {
            if ( answer[i] == a[i%a.length])
                score[0]++;
            if ( answer[i] == b[i%b.length])
                score[1]++;
            if ( answer[i] == c[i%c.length])
                score[2]++;
        }
        
        //최댓값 구하기
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        int cnt =0;
        for ( int i = 0; i < 3; i++ ) {
            if (score[i] == maxScore) {
                cnt++;
            }
        }
        
        int[] result = new int[cnt];
        for ( int i = 0, bb = 0; i < 3; i++ ) {
            if(maxScore == score[i])
                result[bb++] = i+1;
        }
        /*
        if(maxScore == score[0])
            result[0] = 1;
        if(maxScore == score[1])
            result[1] = 2;
        if(maxScore == score[2])
            result[2] = 3;*/
        
        return result;
    }
}