import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {
	static class Pair {
		int x;
		int y;
		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] point = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int x = point[0], y = point[1];
		int[][] A = new int[N][N];
		for ( int i = 0; i < N; i++ ) {
			A[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		
		int findValue = A[x - 1][y - 1];

    if (findValue < 0 || findValue > 10) {
      System.out.println(0);
      return;
    }

    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};

    int answer = 0;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (A[i][j] == findValue) {
          int a = BFS(i, j, N, A, dx, dy, findValue);
          answer = Math.max(answer, a);
        }
      }
    }

  	System.out.println(answer);
		/**
		1. 시작점 찾기
		2. 시작점의 값 구하기
		3. 
		*/
	}
	static int BFS(int x, int y, int N, int[][] A, int[] dx, int[] dy, int findValue) {
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(x, y));
        A[x][y] = -1;
        int count = 0;

        while (!queue.isEmpty()) {
            Pair now = queue.poll();
            count++;

            for (int k = 0; k < 4; k++) {
                int realX = now.x + dx[k];
                int realY = now.y + dy[k];

                if (realX >= 0 && realX < N && realY >= 0 && realY < N) {
                    if (A[realX][realY] == findValue) {
                        A[realX][realY] = -1;
                        queue.add(new Pair(realX, realY));
                    }
                }
            }
        }

        return count;
    }
}