class Solution {
    public long solution(long n) {
        
        String[] an = Long.toString(n).split("");// long을 String으로
        int[] num = new int[an.length];// 실제 정답 담을 배열
        
      
        for ( int i = 0; i < an.length; i++)
            num[i] = Integer.parseInt(an[i]);
     
        // 내림차순 정렬
        for ( int i = 0; i < num.length; i++) {
            for ( int j = 1; j < num.length-i; j++ ) {
                if ( num[j-1] < num[j] ) {
                    int tmp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = tmp;
                }
            }
        }
    
        String str = "";
        for (int i = 0; i < num.length; i++)
            str += Integer.toString(num[i]);
        
        return Long.parseLong(str);
    }
    
    public static void main(String[] args) {
        Solution ri = new Solution();
        System.out.println(ri.solution(118372));
    }
}