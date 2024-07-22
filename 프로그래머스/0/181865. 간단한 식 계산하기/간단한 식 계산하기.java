class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int n1 = Integer.parseInt(arr[0]);
        int n2 = Integer.parseInt(arr[2]);
        String op = arr[1];
        switch(op) {
            case "*": return n1 * n2;
            case "+": return n1 + n2;
            case "-": return n1 - n2;
        }
        return 0;
    }
}