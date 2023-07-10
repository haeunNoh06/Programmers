import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> answer = new ArrayList<>(score.length);
        ArrayList<Integer> list = new ArrayList<>(score.length);
        
        for ( int s : score) {
            list.add(s);
            
            if ( list.size() <= k ) {
                Collections.sort(list);
                answer.add(list.get(0));
            } else {
                Collections.sort(list, Collections.reverseOrder());
                answer.add(list.get(k-1));
            }
        }
        
        return answer.stream()
            .mapToInt(i->i)
            .toArray();
    }
}