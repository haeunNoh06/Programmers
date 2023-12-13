import java.util.*;
class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] arr = my_string.split("");
        //Arrays.sort(index_list);
        for ( int i : index_list ) {
            answer += arr[i];
        }
        return answer;
    }
}