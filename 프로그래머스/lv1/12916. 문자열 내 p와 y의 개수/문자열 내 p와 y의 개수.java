class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int cntP = 0, cntY = 0;

        //char로 바꾸기
        char[] arrC = new char[s.length()];
        for ( int i = 0; i < s.length(); i++ ) {
            arrC[i] = s.charAt(i);
        }
        //for문을 돌려 arrS[i]의 값이 s값이면 cntS++
        //y값이면 cntY++
        for ( int i = 0; i < s.length(); i++) {
            if ( arrC[i] == 'p' || arrC[i] == 'P' ) ++cntP;
            if ( arrC[i] == 'y' || arrC[i] == 'Y') ++cntY;
        }
        //cntY와 cntS가 다르다면 answer을  true로
        if ( cntY == cntP ) answer = true;
        
        return answer;
    }
}