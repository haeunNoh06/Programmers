import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<Integer>();
        my_string = my_string.replaceAll("[^0-9]", "");
        for ( String s : my_string.split(""))
            list.add(Integer.parseInt(s));
        Collections.sort(list);
        return list.stream()
                    .mapToInt(i -> i)
                    .toArray();
    }
}