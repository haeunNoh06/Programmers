import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] failPlayer = new int[N+2];// 실패한 플레이어 수
        int[] totalPlayer = new int[N+2];// 해당 스테이지에 도전한 플레이어 수
        
        // 1. 실패한 플레이어 수와 도전한 플레이어 수 구하기
        for ( int stage : stages ) {
            failPlayer[stage]++;
            for ( int i = 1; i <= stage; i++) {
                totalPlayer[i]++;
            }
        }
        
        Map<Integer, Double> ratesMap = new HashMap<>();// 스테이지별 실패율
        for ( int i = 1; i <= N; i++) {
            // 1. 스테이지별 실패한 사람의 여부를 묻고 실패율 구하고 저장
            double failRate = ( failPlayer[i] == 0 ? 0 : (double)failPlayer[i]/totalPlayer[i] );
            ratesMap.put(i, failRate);
        }
        
        int[] answer = new int[N];
        for ( int i = 0; i < N; i++) {
            int maxKey = 0;
            double maxRate = -1;
            for ( int key : ratesMap.keySet() ) {
                double rate = ratesMap.get(key);
                if ( rate > maxRate ) {
                    maxRate = rate;
                    maxKey = key;
                }
            }
            answer[i] = maxKey;
            ratesMap.remove(maxKey);
        }
        return answer;
    }
}