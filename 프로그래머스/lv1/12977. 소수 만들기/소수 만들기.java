class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        //주어진 수의 개수 확인
        int cntOfNums = nums.length;
        
        //첫째, 둘째, 셋째로 선택 된 수
        int num1, num2, num3;
        
        //첫째 수 선택하는 for
        for ( int i = 0; i < cntOfNums; i++ ) {
            num1 = nums[i];
            //둘째 수 선택하는 for
            for ( int j = i+1; j < cntOfNums; j++ ) {
                num2 = nums[j];
                //셋째 수 선택하는 for
                for ( int k = j+1; k < cntOfNums; k++ ) {
                    num3 = nums[k];
                    //선택된 3개의 수를 더한다.
                    int sum = num1 + num2 + num3;
                    //소수인지 확인
                    if ( isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    
    //소수를 판별하는 메서드
    public boolean isPrime(int n) {
        boolean result = true;
        for ( int i = 2; i <= n/2; i++ ) {
            if ( n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}