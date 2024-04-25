import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		int answer = 3;
		for ( int i = 2; i <= input; i++ ) {
			answer *= 2;
			answer %= 100000007;
			// System.out.println("i: "+i+", answer: "+answer);
		}
		System.out.println(answer);
		// System.out.println(answer%100000007);
	}
}