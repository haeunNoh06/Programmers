class Solution {
    public String solution(String s) {
        String answer = "";
        //원본 문자열의 길이
        int sLength = s.length();
        //변환된 문자들을 저장할 배열
        char[] result = new char[sLength];
        //문자열 처음부터 끝까지 하나씩 문자를 읽어보자
        int totalIndex = 0;
        int wordIndex = 0;
        while(totalIndex < sLength){
            //현재 단어의 현재 위치에서의 문자
            char c = s.charAt(totalIndex);
            //공백 문자이면 넘어가기
            if(c == ' '){
                //char배열에 문자를 저장
                result[totalIndex] = c;                
                //공백이니까 단어 인덱스는 초기화
                wordIndex = 0;
                //전체 인덱스는 증가
                totalIndex++;
                continue;
            }

            if(wordIndex % 2 == 0){
               //소문자이면 대문자로 변환
               if(c >= 'a') {
                  c = (char)(c - ('a' - 'A'));
               }
            }else {
               //대문자이면 소문자로 변환
               if(c < 'a' && c >= 'A') {
                  c = (char)(c + ('a' - 'A'));
               }
            }
            //char배열에 문자를 저장
            result[totalIndex] = c;
            //단어 인덱스는 증가
            wordIndex++;
            //전체 인덱스는 증가
            totalIndex++;
        }
        //완성된 char배열을 String으로 변환해서 리턴
        return new String(result);
    }
}
