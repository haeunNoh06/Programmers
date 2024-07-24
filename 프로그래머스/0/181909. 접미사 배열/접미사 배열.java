import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        String[] arr = my_string.split("");
        for ( int i = 0; i < answer.length; i++ ) {
            String str = "";
            for ( int j = i; j < arr.length; j++ ) {
                str += arr[j];
            }
            answer[i] = str;
            str = "";
        }
        Arrays.sort(answer);
        return answer;
    }
}