import java.io.*;
import java.math.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long input = Long.parseLong(br.readLine());
		System.out.println(getFactorial(input));
	}
	
	public static long getFactorial(long n) {
		long num = 1;
		for ( long i = 2; i <= n; i++ ) {
			num *= i;
			num %= 1000000007;
		}
		return num;
	}
}