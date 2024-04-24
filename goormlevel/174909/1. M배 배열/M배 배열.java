import java.io.*;
import java.util.stream.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] N = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		//System.out.println(6%3);
		for ( int i = 0; i < N[0]; i++ ) {
			if ( arr[i] == 1 ) arr[i] = N[1];
			else if ( arr[i] % N[1] != 0 ) arr[i] *= N[1];
			
			// if ( N[1] > arr[i] ) {
			// 	if ( N[1] % arr[i] != 0 ) arr[i] *= N[1];
			// } else {
			// 	if ( arr[i] % N[1] != 0 ) arr[i] *= N[1];
			// }
			//System.out.println(1%(double)3);
			//System.out.println((double)3%1);
		}
		
		for ( int i = 0; i < N[0]; i++ ) {
			System.out.print(arr[i]+" ");	
		}
		/**
		
		*/
	}
}