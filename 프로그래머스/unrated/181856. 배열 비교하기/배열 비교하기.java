class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length, len2 = arr2.length;
        if ( len1 != len2 )
            return answer = ( len1 > len2 ? 1 : -1 );
        else {
            int sum1 = 0, sum2 = 0;
            for ( int n : arr1 ) {
                sum1 += n;
            }
            for ( int n : arr2 ) {
                sum2 += n;
            }
            answer = ( sum1 > sum2 ? 1 : ( sum1 == sum2 ? 0 : -1 ));
        }
        return answer;
    }
}