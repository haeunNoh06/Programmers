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
        /*String answer = "";
        int month = a;
        int day1 = b;       //누적 일 수
        
        for ( int i = 1; i < month; i++ ) {
            if ( i == 2)
                day1 += 29;
            else if ( (i == 4) || (i == 6) || (i == 9 ) || (i == 11) )
                day1 += 30;
            else
                day1 += 31;
            
        }
        
        int rest = day1 % 7;
        switch ( rest ) {
            case 1: answer = "FRI"; break;
            case 2: answer = "SAT"; break;
            case 3: answer = "SUN"; break;
            case 4: answer = "MON"; break;
            case 5: answer = "TUE"; break;
            case 6: answer = "WED"; break;
            case 0: answer = "THU";
        }
        
        return answer;*/
        
        int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        String[] weekday = {"THU", "FRI", "SAT","SUN","MON","TUE","WED"};
        int days = b;
        
        for ( int i = 0; i <a; i++) 
            days += months[i];
        
        return weekday[days%7];
    }
}