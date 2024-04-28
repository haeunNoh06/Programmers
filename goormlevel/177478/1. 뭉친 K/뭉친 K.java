import java.io.*;
import java.util.*;
import java.util.stream.*;
class Main {
	static class Point {
		int x, y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] point = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[][] M = new int[N][N];
		for ( int i = 0; i < M.length; i++ ) {
			M[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		int findValue = M[point[0]-1][point[1]-1];
		int[] dx = {0, 1, 0, -1};
		int[] dy = {-1, 0, 1, 0};
		int maxGroupSize = 0;
		
		for ( int i = 0; i < M.length; i++ ) {
			for ( int j = 0; j < M[i].length; j++ ) {
				if ( M[i][j] == findValue ) {
					int cnt = BFS(i, j, findValue, M, dx, dy);
					maxGroupSize = Math.max(maxGroupSize, cnt);
				}
			}
		}
		System.out.println(maxGroupSize);
	}
	
	public static int BFS(int i, int j, int findValue, int[][] M, int[] dx, int[] dy) {
		Queue<Point> queue = new LinkedList<>();
		queue.offer(new Point(i,j));
		M[i][j] = -1;
		int count = 0;
		while ( !queue.isEmpty() ) {
			Point now = queue.poll();
			count++;
			for ( int k = 0; k < 4; k++ ) {
				int x = now.x+dx[k];
				int y = now.y+dy[k];
				if ( x >= 0 && x < M.length && y >= 0 && y < M.length ) {
					if ( M[x][y] == findValue ) {
						queue.offer(new Point(x,y));
						M[x][y] = -1;
					}
				}
			}
		}
		return count;
	}
}