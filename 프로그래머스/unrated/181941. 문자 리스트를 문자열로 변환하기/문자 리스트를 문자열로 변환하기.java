class Solution {
    public String solution(String[] arr) {
        for ( int i = 1; i < arr.length; i++ ) {
            arr[0] = arr[0].concat(arr[i]);
        }
        return arr[0];
    }
}