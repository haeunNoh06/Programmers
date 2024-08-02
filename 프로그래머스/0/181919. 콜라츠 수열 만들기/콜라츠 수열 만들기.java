import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        do {
            list.add(n);
            n = ( n % 2 == 0 ? n / 2 : 3 * n + 1);
        } while( n != 1 );
        list.add(1);
        return list.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}