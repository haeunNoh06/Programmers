class Solution {
    public String solution(String myString) {
        String answer = "";
        myString = myString.replaceAll("a", "A");
        for ( char c : myString.toCharArray() ) {
            if ( c < 'a' && c != 'A' && c != ' ') {
                myString = myString.replace(c, (char)(c+32));
            }
        }
        return myString;
    }
}