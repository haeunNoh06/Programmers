class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for ( char c : my_string.toCharArray() ) {
            answer[(int)(c-'A') - (c >= 'a' ? 6 : 0)]++;
        }
        return answer;
    }
}