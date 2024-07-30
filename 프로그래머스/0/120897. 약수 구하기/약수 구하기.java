import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for ( int i = 2; i <= n; i++ ) {
            if ( n % i == 0 )
                list.add(i);
        }
        return list.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}