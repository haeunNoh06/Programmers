class Solution {
    public int solution(String num_str) {
        String[] answer = num_str.split("");
        int sum = 0;
        for ( String str : answer )
            sum += Integer.parseInt(str);
        return sum;
    }
}