import java.io.*;
class Main {
	static long[] memo;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		memo = new long[K+1];
		System.out.println(fibonacci(K));
	}
	public static long fibonacci(int k) {
		long sum = 1;
		if ( k <= 1 ) return 0;
		memo[1] = 0;
		memo[2] = 1;
		for ( int i = 3; i <= k; i++ ) {
			memo[i] = (memo[i-1]+memo[i-2])%1000000007;
		}
		return memo[k]%1000000007;
		//return memo[k] = (fibonacci(k-1) + fibonacci(k-2))%1000000007;
	}
	/**
	
	*/
}