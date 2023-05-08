class Solution {
    public int solution(int hp) {
        int five, three, one;
        five = hp/5;
        three = (hp-(five*5))/3;
        one = hp-(five*5+three*3);
        return five+three+one;
    }
}