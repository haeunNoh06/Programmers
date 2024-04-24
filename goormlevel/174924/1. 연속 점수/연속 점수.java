import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] S = br.readLine().split(" ");
		
		int max = 1;
		int sum = Integer.parseInt(S[0]);
		
		for ( int i = 0; i < N-1; i++ ) {
			int num1 = Integer.parseInt(S[i]);
			int num2 = Integer.parseInt(S[i+1]);
			if ( num1+1 == num2 ) sum += num2;
			else {
				sum = num2;
			}
			
			max = ( sum > max ? sum : max );
		}
		
		Arrays.sort(S);
		int num = Integer.parseInt(S[N-1]);
		max = ( num > max ? num : max );
		System.out.println(max);
		/**
		int max = 1;
		int sum = Integer.parseInt(S[0]);
		for ( S 순회 ) {
			 num[i]+1와 num[i+1]가 같다면 sum += num[i+1];
			 다르다면 max값과 sum을 비교하여 max값 업데이트 
		}
		if ( max값과 Integer.parseInt(Arrays.sort(S))[S.length-1] 비교해서 가장 큰 값 answer에 저장 )
		*/
	}
}