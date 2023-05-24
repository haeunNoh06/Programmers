import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        int idx = 0;
        Arrays.sort(strings);
        for ( int i = 'a'; i < 'z'; i++) {
            for ( int j = 0; j < strings.length; j++) {
                if ( (char)i == strings[j].charAt(n) )
                    answer[idx++] = strings[j];
            }
        }
        return answer;
    }
}