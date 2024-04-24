import java.io.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input1 = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");
		System.out.println(solution(input1, input2));
	}
	
	public static int solution(String[] input1, String[] input2 ) {
		int N = Integer.parseInt(input1[0]);
		String str = input1[1];
		input2 = Arrays.stream(input2)
						.filter(i -> !i.contains(str))
						.toArray(String[]::new);
		return input2.length;
	}
}