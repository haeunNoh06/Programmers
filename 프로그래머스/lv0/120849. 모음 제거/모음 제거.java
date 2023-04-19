class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] answers = my_string.split("");
        for ( int i = 0; i < answers.length; i++) {
            if ( answers[i].equals("a") || answers[i].equals("e") || answers[i].equals("i") 
               || answers[i].equals("o") || answers[i].equals("u"))
                continue;
            answer += answers[i];
        }
        return answer;
    }
}