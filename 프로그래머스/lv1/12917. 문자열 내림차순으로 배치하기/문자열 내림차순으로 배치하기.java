import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
        char[] alphabet = s.toCharArray();
        Arrays.sort(alphabet);
        return new StringBuilder(new String(alphabet)).reverse().toString();
    }
} 