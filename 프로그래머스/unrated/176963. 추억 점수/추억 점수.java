class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        for ( int i = 0; i < answer.length; i++) {
            answer[i] = 0;
        }
        for ( int i = 0; i < name.length; i++) {
            for ( int j = 0; j < photo.length; j++) {
                for ( int k = 0; k < photo[j].length; k++) {
                    if ( name[i].equals(photo[j][k])) {
                        answer[j] += yearning[i];
                    }
                }
            }
        }
        return answer;
    }
}