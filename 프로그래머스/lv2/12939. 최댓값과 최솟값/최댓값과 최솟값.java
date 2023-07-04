import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]), min = Integer.parseInt(arr[0]);
        for ( int i = 1; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if ( num < min ) min = num;
            if ( num > max ) max = num;
        }
        return min+" "+max;
    }
}