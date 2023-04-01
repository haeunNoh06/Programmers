class Solution {
    public int solution(int n, int k) {
        int price = 0;
        price += (12000*n)+(2000*k);
        for ( int i = 1; i <= n; i++) {
            if ( i%10 == 0) {
                price -= 2000;
            }
        }
        return price;
    }
}