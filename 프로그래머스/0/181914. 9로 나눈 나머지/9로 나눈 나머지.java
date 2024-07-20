class Solution {
    public int solution(String number) {
        String[] arr = number.split("");
        int sum = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            int num = Integer.parseInt(arr[i]);
            sum += num;
        }
        return sum%9;
    }
}