import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int num = 1;
		for ( int i = 0; i < N; i++ ) {
			for ( int j = 1; j < N; j++ ) {
				if ( j == 1 ) System.out.print((num++));
				System.out.print(" "+(num++));
			}
			System.out.println();
		}
		
	}
}