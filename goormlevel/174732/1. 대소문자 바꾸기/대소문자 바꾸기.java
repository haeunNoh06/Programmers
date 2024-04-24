import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		char[] ch = S.toCharArray();
		String answer = "";
		for ( char c : ch ) {
			if ( c >= 'a') c -= 32;
			else c += 32;
			answer += c+"";
		}
		
		System.out.println(answer);
	}
}