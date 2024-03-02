import java.util.*;
class Solution {
    public int solution(String dirs) {
        int answer = 0, startX = 0, startY = 0, endX = 0, endY = 0;
        String op1 = "", op2 = "";
        HashSet<String> set = new HashSet<String>();
        for ( String d : dirs.split("") ) {
            startX = endX;
            startY = endY;
            if ( d.equals("U") ) {
                if ( startY == 5 ) continue;
                endY++;
            } else if ( d.equals("D") ) {
                if ( startY == -5 ) continue;
                endY--;
            } else if ( d.equals("L") ) {
                if ( startX == -5 ) continue;
                endX--;
            } else if ( d.equals("R") ) {
                if ( startX == 5 ) continue;
                endX++;
            }
            
            op1 = startX+""+startY+" "+endX+""+endY;
            op2 = endX+""+endY+" "+startX+""+startY;
            
            // 중복제거 
            if ( !set.contains(op1) ) {
                set.add(op1);
                set.add(op2);
                System.out.println(op1);
            }
        }
        answer = set.size()/2;
        return answer;
    }
}