class Solution {
    public int[] solution(String myString) {
        String[] strArr = myString.split("x");
        int size = strArr.length;
        if ( myString.split("")[myString.length()-1].equals("x") )
            size++;
        for ( int i = 0; i < strArr.length; i++ ) 
            System.out.println(strArr[i]);
        int[] answer = new int[size];
        for ( int i = 0; i < size; i++ ) {
            if ( i == size-1 && myString.split("")[myString.length()-1].equals("x") ) {
                answer[i] = 0;
                break;
            }
            answer[i] = strArr[i].length();
        }
        return answer;
    }
}