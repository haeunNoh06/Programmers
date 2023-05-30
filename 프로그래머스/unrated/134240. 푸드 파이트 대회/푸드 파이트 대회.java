class Solution {
	public String solution(int[] food) {
		String me = "0", you = "";
        for ( int i = food.length-1; i >= 1; i-- ) {
			if ( food[i] <= 1 )
				continue;
			for ( int j = 1; j <= food[i]/2; j++ ) {
				me = Integer.toString(i)+me+Integer.toString(i);
			}
		}
		return me;
	}
}