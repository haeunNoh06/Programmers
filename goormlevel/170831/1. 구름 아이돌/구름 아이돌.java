import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] strs = br.readLine().split(" ");
		int[][] arr = new int[N][2];
		for ( int i = 0; i < N; i++ ) {
			arr[i][0] = Integer.parseInt(strs[i]);
			arr[i][1] = i+1;
		}
		
		Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
		// for ( int i = 0; i < N; i++ ) {
		// 	System.out.println(arr[i][0]+", "+arr[i][1]);
		// }
		System.out.println(arr[N-1][1]+" "+arr[N-2][1]+" "+arr[N-3][1]);
		
	}
}