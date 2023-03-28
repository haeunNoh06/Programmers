import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        String strN = n+"0";
        int[] arrN = new int[strN.length()];

        //for문을 이용해 한 자릿수씩 arrN에 저장한다.
        //arrN에 들어있는 값을 for문을 이용해 합계를 구한다.
        
        for ( int i = 0; i < strN.length(); i++ ) {
            arrN[i] = n%10;
            n /= 10;
            sum += arrN[i];
        }

        return sum;
    }
}