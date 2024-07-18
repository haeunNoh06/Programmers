class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0]*numbers[1];
        /**
문제의 제한 사항입니다.
*-10,000 ≤ numbers의 원소 ≤ 10,000
그렇다면 big_num 가 10000 * -10000 이라고 한다면 어떻게 될까요?
아니면 numbers 의 모든 원소 가 단 하나만 제외 하고 음수면 어떻게 되죠?
        */
        for ( int i = 0; i < numbers.length; i++ ) {
            for ( int j = 1; j < numbers.length; j++ ) {
                int num1 = numbers[i];
                int num2 = numbers[j];
                if ( i == j ) continue;
                int max = Math.max(num1*num2, (-1*num1)*(-1*num2));
                if ( answer < max )
                    answer = max;
            }
        }
        return answer;
    }
}