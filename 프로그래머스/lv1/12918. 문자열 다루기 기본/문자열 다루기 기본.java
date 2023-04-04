class Solution {
    public boolean solution(String s) {
        return /^\d{4}$|^\d{6}$/.test(s);
    }
}