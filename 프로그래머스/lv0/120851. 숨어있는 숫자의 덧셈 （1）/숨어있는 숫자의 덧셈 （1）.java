class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str;
        str = my_string.replaceAll("[^0-9]", "");
        String[] arr = str.split("");
        for ( String s : arr ) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}