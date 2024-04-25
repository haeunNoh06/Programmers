import java.io.*;
import java.util.stream.*;
import java.util.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] arr = Stream.of(input).mapToInt(Integer::parseInt).toArray();
		
		String answer = "";
		
		int sum = 0;
		for ( int num : arr )
			sum+=num;
		//System.out.println("sum: "+sum);
		
		while ( sum / 8 != 0 ) {
			answer += String.valueOf(sum%8);
			sum /= 8;
			//System.out.println(answer+", "+sum);
		}
		System.out.println(new StringBuffer(answer+String.valueOf(sum)).reverse().toString());
		/**
		10 % 8 = 2
		1 % 8 = 1
		0
		
		24 % 8 = 0
		3 % 8 = 3
		0
		*/
	}
}