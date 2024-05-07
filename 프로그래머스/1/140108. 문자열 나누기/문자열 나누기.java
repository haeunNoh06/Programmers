import java.util.*;
class Solution {
    public int solution(String s) {
        List<String> list = new ArrayList<>();
        char[] chs = s.toCharArray();
        char standard = chs[0];// 비교할 기준값 
        int xCnt = 1, notXCnt = 0;// x와 같은 수, x가 아닌 수
        String str = standard+"";// list에 저장할 문자열 저장
        if ( chs.length == 1 ) return 1;
        for ( int i = 1; i < chs.length; i++ ) {
            str += chs[i];// str에 현재 문자 저장 
            if ( chs[i] == standard )
                xCnt++;
            else
                notXCnt++;// x인지 x가 아닌지 판별
            if ( xCnt == notXCnt ) {// 만약 값이 똑같아지면
                list.add(str);// list에 해당 문자열 넣기 
                str = "";// 문자열 초기화 
                xCnt = 0;
                notXCnt = 0;
                standard = (i+1 < chs.length ? chs[i+1] : 0);
            }
        }
        if ( !str.equals("") ) list.add(str);
        return list.size();
    }
}