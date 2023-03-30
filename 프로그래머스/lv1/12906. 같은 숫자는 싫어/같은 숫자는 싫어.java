import java.util.*;// import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();// int형 스택 선언
        stack.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {            
            if (stack.peek() != arr[i]) {// stack 최상단에 있는 값이 arr[i]가 아니면
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];// stack의 크기만큼 answer 크기 세팅
        for (int i = answer.length-1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}