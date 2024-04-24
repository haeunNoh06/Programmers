import java.util.Arrays;

class Solution {
    public int solution(int[] nums) {
        
        Arrays.sort(nums);
        
        int cnt = 1;
        for ( int i = 1; i < nums.length; i++) {
            if ( nums[i-1] == nums[i] ) continue;
            if ( nums.length/2 == cnt ) return cnt;
            cnt++;
        }
        
        return cnt;
    }
}