class Solution {
    public String solution(String my_string, int n) {
        return (new StringBuffer(my_string).substring(my_string.length()-n, my_string.length())).toString();
    }
}