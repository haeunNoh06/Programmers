import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][2];
		for ( int i = 0; i < N; i++ ) {
			String s = br.readLine();
			for ( int j = 0; j < 2; j++ ) {
				arr[i][j] = Integer.parseInt(s.split(" ")[j]);
			}
		}
		
		int[] max = {0,0,0};// 무게, 부피, 번호
		double m = 0;// 최대 밀도 
		
		for ( int i = 0; i < arr.length; i++ ) {
			double n = (double)arr[i][0]/arr[i][1];//현재 밀도 
			//System.out.println("n: "+n+" m: "+m);
			if ( n > m ) {
				m = n;// - 물질의 밀도 
				max[0] = arr[i][0];// - 물질의 무게
				max[1] = arr[i][1];// - 물질의 부피
				max[2] = i+1;// - 번호 
			} else if ( m == n ) {//물질의 밀도가 같다면
				if ( arr[i][0] > max[0] ) {//더 무거운 물질의 번호 출력 
					max[0] = arr[i][0];
					max[2] = i+1;
				}
			} else if ( arr[i][0] == max[0] ) {//물질의 무게가 같다면
				//가장 번호가 작은 물질의 번호 출력
				max[0] = arr[i][0];
				if ( i+1 < max[2] ) max[2] = i+1;
			}
			
		}
		System.out.println(max[2]);
		/**
		밀도 = 무게/부피
		arr[i][0] = 무게(w)
		arr[i][1] = 부피(v)
		
		int[] max = {1,1,1, 0};
		for ( arr 순환 ) {
			int n = arr[i][0]/arr[i][1];
			if ( n이 max보다 크다면 ) {
				max[0] = n; - 물질의 밀도 
				max[1] = arr[i][0]; - 물질의 무게
				max[2] = arr[i][1]; - 물질의 부피
				max[3] = i+1; - 번호 
			} else if ( 물질의 밀도가 같다면 max[0] == n ) {
				if ( 물질의 무게가 다르다면 arr[i][0] > max[1] ) {
					더 무거운 물질의 번호 출력 
					max[1] = arr[i][0];
					max[2] = arr[i][1];
					max[3] = i+1;
				} else if ( 물질의 무게가 같다면 arr[i][0] > max[1] ) {
					가장 번호가 작은 물질의 번호 출력
					max[3] = ( i+1 > max[3] ? i+1 : max[3]);
				}
			}
			
		}
		*/
	}
}