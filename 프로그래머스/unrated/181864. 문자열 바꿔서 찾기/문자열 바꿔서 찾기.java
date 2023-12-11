class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        for ( String s : myString.split("")) {
            str += ( s.equals("A") ? "B" : (s.equals("B") ? "A" : "B"));
        }
        System.out.println(str);
        if ( str.contains(pat) )
            answer = 1;
        return answer;
    }
}