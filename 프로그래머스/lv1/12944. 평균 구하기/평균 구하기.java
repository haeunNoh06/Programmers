class Solution {
    public double solution(int[] arr) {
        double avg = 0;
        int sum = 0;
        
        for ( int i = 0; i < arr.length; i++ ) {
            sum += arr[i];
        }
        avg = (double)sum/arr.length;
        
        return avg;
    }
}