import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int len = citations.length;
        boolean isEnded = false;
        
        Arrays.sort(citations);
        if ( citations[len-1] == 0 ) return 0;
        for ( int i = 0; i < len; i++ ) {
            for ( int j = len-1; j >= len-1-i; j-- ) {// 
                if ( citations[j] > answer ) {
                    if ( j == len-1-i ) answer++;// 마지막 문자까지 조건충족 시 h+1
                } else {
                    isEnded = true;
                    break;
                }
            }
            if ( isEnded ) break;
        }
        /*
        반례
        입력값 〉 [0, 1, 2, 2, 2]
        기댓값 〉 2
        실행 결과 〉 실행한 결괏값 0이 기댓값 2과 다릅니다.


        */
        
        /**
        0. Arrays.sort(citations) - 정렬을 통해 최대값인 h를 더 효과적으로 구하기 위함
        1. int max = citations[citations.length-1]; - 이 최대값이 h의 초기값이 된다
            - h--
        2. for citations 반대로 반복 - 처음에 h++;
        3. int 0~h까지 돌며 h를 구하는 카운트
        4. if ( c가 h보다 크다면 ) {
            continue;
        } 크지않다면 {
            break;로 현재 h값에서 머무르기 
        }
        5. 0, 1, 3, 5, 6
        - 1편의 논문은 1회 이상 인용됨
        - 2편의 논문은 2회 이상 인용됨
        - 3편의 논문은 3회 이상 인용됨
        
        - 4편의 논문은 4회 이상 인용되지 않음
        
        */
        return answer;
    }
}