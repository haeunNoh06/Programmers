class Solution {
    public String solution(String phone_number) {
        String answer = "";
        //전화번호 길이
        int phoneLength = phone_number.length();
        //변환될 문자들을 저장할 배열
        char[] chars = new char[phoneLength];
        for(int i = 0; i < phoneLength; i++) {
            //i가 전체 길이-4 이전까지는 *만 저장
            if(i < phoneLength - 4) {
                chars[i] = '*';
            } else {
                chars[i] = phone_number.charAt(i);
            }
        }
        //char배열을 문자열로 만든다.
        return new String(chars);
    }
}