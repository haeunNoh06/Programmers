import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        //A, B의 숫자들을 오름차순으로 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        
        //A의 크기만큼 연산
        for (int i = 0; i < A.length; i++ ) {
            //A는 처음부터 연산, B는 마지막부터 연산
            answer += A[i] * B[B.length-(i+1)];
        }

        return answer;
    }
}