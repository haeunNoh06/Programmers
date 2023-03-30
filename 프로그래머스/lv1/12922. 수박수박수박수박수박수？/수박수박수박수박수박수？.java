class Solution {
    public String solution(int n) {
        String answer = "";
        String[] result = new String[n];
        
        for ( int i = 0; i < n; i++ ) {
            result[i] = ( i%2 == 0 ? "수": "박");
        }
        answer = String.join("", result);   //합친 문자열 반환
        //첫 번째 인자로 배열의 원소간 연결할 구분 문자, 두 번째 인자로 배열을 넣습니다.
        
        return answer;
    }
}