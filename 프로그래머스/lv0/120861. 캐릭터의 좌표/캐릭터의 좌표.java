class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] coordinate = {0,0};// 좌표
        int width = board[0]/2;
        int height = board[1]/2;
        
        for ( int i = 0; i < keyinput.length; i++) {
            
            if ( keyinput[i].equals("left") && coordinate[0]-1 >= -width) {
                coordinate[0]--;
            } else if ( keyinput[i].equals("right") && coordinate[0]+1 <= width) {
                coordinate[0]++;
            } else if ( keyinput[i].equals("up") && coordinate[1]+1 <= height) {
                coordinate[1]++;
            } else if ( keyinput[i].equals("down") && coordinate[1]-1 >= -height) {
                coordinate[1]--;
            }
        }
        
        return coordinate;
    }
}