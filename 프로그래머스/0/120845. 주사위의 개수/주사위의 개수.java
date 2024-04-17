class Solution {
    public int solution(int[] box, int n) {
        for ( int i = 0; i < box.length; i++ ) {
            if ( box[i] % n != 0 ) {
                do {
                    box[i]--;
                } while ( box[i] % n != 0 );
            } 
        }
        return (box[0]*box[1]*box[2])/(n*n*n);
    }
}