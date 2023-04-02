import java.util.Stack;
class Solution {
    public String solution(String numbers, int k) {
        //String answer = "";
        //결과를 담을 char배열 준비 - 주어진 숫자에서 k개의 자리를 뺀 만큼
        char[] result = new char[numbers.length() - k];
        //스택 자료구조를 준비
        Stack<Character> stack = new Stack<>();

        //주어진 숫자의 자리수만큼 반복
        for (int i=0; i<numbers.length(); i++) {
            //각 자리에 있는 문자를 읽어서
            char c = numbers.charAt(i);
            //스택에 내용이 있고
            //마지막에 넣은 값이 c보다 작고
            //아직 k개 만큼 숫자를 제거하지 않았다면
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                //스택에서 마지막에 넣었던 문자를 제거한다.
                stack.pop();
            }
            //스택에 더 이상 저장된 값이 없거나
            //스택 마지막에 있는 값이 c보다 크거나
            //이미 k개 만큼의 숫자를 제거했다면
            //스택에 c를 저장한다.
            stack.push(c);
        }
        //스택에 저장된 내용들을 result 배열에 저장한다.
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
            //answer += stack.get(i);
        }
        //만들어진 char배열을 String으로 변환해서 리턴.
        return new String(result);
    }
}