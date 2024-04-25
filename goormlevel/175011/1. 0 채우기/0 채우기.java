import java.io.*;
import java.util.stream.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][N];
		for ( int i = 0; i < arr.length; i++ ) {
			arr[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		boolean isEnded = false;
		int sum = 0;
		for ( int i = 0; i < N; i++ ) {
			for ( int j = 0; j < N; j++ ) {
				if ( arr[i][j] == 0 ) {
					for ( int k = 0; k < N; k++ )
						sum += arr[i][k];
					for ( int k = 0; k < N; k++ )
						sum += arr[k][j];
					arr[i][j] = sum;
					isEnded = true;
					break;
				}
			}
			if ( isEnded ) break;
		}
		System.out.println(sum);
		/**
		boolean isEnded = false;
		int sum = 0;
		for ( arr 순회 ) {
			for ( arr[i] 순회 ) {
				if ( arr[i][j] == 0 ) {
					for ( arr[i][k] 총합 )
					for ( arr[k][j] 총합 )
					arr[i][j] = sum;
					isEnded = true;
					break;
				}
			}
			if ( isEnded ) break;
		}
		System.out.println(sum);
		*/
	}
}