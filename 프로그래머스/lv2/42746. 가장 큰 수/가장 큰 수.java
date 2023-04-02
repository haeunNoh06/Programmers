import java.util.Arrays;
import java.util.Comparator;

class Solution {
        public String solution(int[] numbers) {
            String[] str = new String[numbers.length];
            
            for (int i = 0; i < numbers.length; i++) {
                str[i] = String.valueOf(numbers[i]);
            }
            
            Arrays.sort(str, new Comparator<String>() {
                
                @Override
                public int compare(String o1, String o2) {
                    // 어떤 순서가 더 큰지 확인하여 정렬 기준으로 지정
                    return (o2 + o1).compareTo(o1 + o2);
                }
            });
            
            String answer = String.join("", str);
            
            // 맨 앞자리가 '0'이면 '00' '000'으로 나올 수 있음
            // [0, 0, 0] 케이스인 경우 답이 "0"로 나와야함
            if (answer.charAt(0) == '0')
                return "0";
            
            return answer;
        }
    }