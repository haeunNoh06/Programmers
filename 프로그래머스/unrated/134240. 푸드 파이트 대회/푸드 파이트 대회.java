class Solution {
	public String solution(int[] food) {
		String me = "", you = "";
		
		for ( int i = 1; i < food.length; i++ ) {
			if ( food[i] <= 1 )
				continue;
			for ( int j = 1; j <= food[i]/2; j++ ) {
				me += Integer.toString(i);
				you = Integer.toString(i) + you;
			}
		}

		return me+"0"+you;
	}
}