import java.io.*;
import java.util.*;
import java.util.stream.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] strs = new String[N][2];
		for ( int i = 0; i < N; i++ ){
			String[] input = br.readLine().split(" ");
			strs[i][0] = input[0];
			strs[i][1] = input[1];
		}
		int[][] arr = new int[N][2];
		for ( int i = 0; i < arr.length; i++ ) {
			arr[i] = Stream.of(strs[i]).mapToInt(Integer::parseInt).toArray();
		}
		Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));// 끝나는 시간을 기준으로 정렬
		
		int answer = 1, lastEndTime = arr[0][1];
		for ( int i = 1; i < N; i++ ) {
			if ( lastEndTime < arr[i][0] ) {
				answer++;
				lastEndTime = arr[i][1];
				//System.out.println(arr[i][0]+", "+arr[i][1]+", "+answer);
			}
		}
		
		System.out.println(answer);
		
		/**
		1. 끝나는 시간 기준으로 정렬
		for ( arr 순회 ) {
			if ( 현재행사 끝나는 시간이 다음행사 끝나는 시간보다 작다면 ) {
				시간이 겹치지 않는 것이니 answer++;
			}
		}
		*/
	}
}