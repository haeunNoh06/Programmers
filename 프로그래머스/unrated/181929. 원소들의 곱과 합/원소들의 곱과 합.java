class Solution {
    public int solution(int[] num_list) {
        int multiply = 1, sum = 0;
        for ( int num : num_list ) {
            multiply *= num;
            sum += num;
        }
        return (multiply < Math.pow(sum,2) ? 1 : 0);
    }
}