class Solution {
    public String[] solution(String[] strArr) {
        String str = "";
        for ( String s : strArr ) {
            if ( s.contains("ad") ) {
                continue;
            }
            str += s+" ";
        }
        return str.split(" ");
    }
}