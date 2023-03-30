class Solution {
    public String solution(String s) {
        String answer;
        String[] arr = s.split("");
        
        //if ( s.length()%2 != 0 ) answer = arr[(s.length()-1) / 2];
        //else answer = arr[s.length()/2-1]+arr[s.length()/2];
        
        answer = (s.length()%2 == 0 ? arr[s.length()/2-1]+arr[s.length()/2] : arr[(s.length()-1) / 2] );
        
        return answer;
    }
}