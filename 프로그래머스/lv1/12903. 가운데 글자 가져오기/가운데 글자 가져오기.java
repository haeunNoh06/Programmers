class Solution {
    public String solution(String s) {
        String[] ch = s.split("");
        return ( ch.length % 2 == 0 ? 
                        ch[ch.length/2-1]+ch[ch.length/2] :
                        ch[ch.length/2]);
    }
}