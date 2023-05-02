class Solution {
    public String solution(String my_string, String alp) {
        return ( my_string.indexOf(alp) < 0 ? my_string :
            my_string.replace(alp,my_string.substring(my_string.indexOf(alp),my_string.indexOf(alp)+1).toUpperCase()));
    }
}