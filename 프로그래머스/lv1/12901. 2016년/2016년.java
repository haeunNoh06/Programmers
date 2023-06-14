class Solution {
    public String solution(int a, int b) {      
        //윤년 : 1월 31일, 
        //2월 29일
        // 3월 31
        // 4 30
        //5 31
        //6 30
        //7 31
        //8 31
        //9 30
        //10 31
        //11 30
        //12 31
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        String[] weekday = {"THU", "FRI", "SAT","SUN","MON","TUE","WED"};
        int days = b;
        
        for ( int i = 1; i <a; i++) 
            days += months[i];
        
        return weekday[days%7];
    }
}