class Solution {
    public String solution(String s, int n) {
        String answer = "";
        //전체 문자열 길이
        int sLength = s.length();
        //변환결과를 담을 char 배열
        char[] result = new char[sLength];
        //문자열 s 전체를 순회하자
        for(int i = 0; i < sLength; i++){
            //현재 위치의 문자를 읽자
            char c = s.charAt(i);
            //제한조건1. 공백은 공백이다.
            if(c == ' ') {
                //공백을 result에 저장
                result[i] = c;
                continue;
            }
            //문자 c가 대문자인지 소문자인지 파악
            if(c >= 65 && c <= 90){
                //대문자
               //n만큼 이동한 것이 대문자 Z보다 크다면 대문자 Z을 나눈 나머지-1를 대문자 A에 더해서 변환한다.
               if(c+n > 90) {
                  int newTerm = (c+n)%90;
                  c = (char)('A' + newTerm-1);
               }else {
                  //대문자 Z 보다 작을 경우 그 위치의 문자로 대체한다.
                  c = (char)(c + n);
               }
            }else if(c >= 97 && c <= 122){
                //소문자
               //n만큼 이동한 것이 소문자 z보다 크다면 소문자 z을 나눈 나머지-1를 소문자 a에 더해서 변환한다.
               if(c+n > 122) {
                  int newTerm = (c+n)%122;
                  c = (char)('a' + newTerm-1);
               }else {
                  //소문자 z 보다 작을 경우 그 위치의 문자로 대체한다.
                  c = (char)(c + n);
               }
            }
            //변환된 문자를 result에 저장
            result[i] = c;
        }
        return new String(result);
    }
}
