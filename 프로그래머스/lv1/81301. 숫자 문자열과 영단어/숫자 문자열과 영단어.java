class Solution {
    public int solution(String s) {
        String[] strN = {"zero", "one", "two", "three", "four", 
                         "five", "six", "seven", "eight", "nine"};
        for ( int i = 0; i < strN.length; i++) {
            s = s.replace(strN[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}