import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = Arrays.stream(numlist)
                                .boxed()
                                .collect(Collectors.toList());
        for ( int num : numlist )
            if ( num % n != 0 ) 
                list.remove(Integer.valueOf(num));

        return list.stream()
                    .mapToInt(i -> i)
                    .toArray();
    }
}