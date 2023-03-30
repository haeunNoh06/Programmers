class Solution {
    public int solution(int n) {
		int answer = 0;
		String str = "";
		
		int num = n;
		while(num != 0) {
			str += Integer.toString(num%3);
			num /= 3;
		}
		
		String[] arr = str.split("");// 배열로 값 하나씩 담기
        /*
		System.out.println(arr.length);
		for ( int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
        */
		
		int idx = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			num = Integer.parseInt(arr[i]);// 정수로 변환
			answer += (int)(num*Math.pow(3, idx++));
		}
		
		return answer;
    }
}