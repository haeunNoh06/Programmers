import java.io.*;
import java.util.*;
import java.util.stream.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] arr = new int[input[1]];
		for ( int i = 0; i < arr.length; i++ ) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		HashSet<Integer> hs = new HashSet<>(input[0]);
		boolean firstEnd = true;
		int answer = -1;
		
		for ( int i = 0; i < arr.length; i++ ) {
			hs.add(arr[i]);
			if ( hs.size() == input[0] && firstEnd ) {
				firstEnd = false;
				answer = i+1;
			}
		}
		System.out.println(answer);
		/**
		boolean firstEnd = true;
		int answer = -1;
		for ( arr 순회 ) {
			hs.add(arr[i]);
			if ( hs.size() == input[0] && firstEnd ) isEnded = false; answer = i+1;
		}
		
		
		*/
		
		//System.out.println(hs);
	}
}