import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> before = new ArrayList<>();
        List<Integer> after = new ArrayList<>();
        for ( int i = 0; i < n; i++ ) {
            before.add(num_list[i]);
        }
        for ( int i = n; i < num_list.length; i++ ) {
            after.add(num_list[i]);
        }
        for ( int i = 0; i < after.size(); i++ ) {
            answer.add(after.get(i));
        }
        for ( int i = 0; i < before.size(); i++ ) {
            answer.add(before.get(i));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}