import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] money = {40,20,10,5,1};
		int index = 0, rest = N, answer = 0;
		while ( rest != 0 ) {// 나머지가 0이 되면 완료하기
			if ( money[index] > rest ) index++;
			else {
				answer+=rest/money[index];
				rest %= money[index];
			}
		}
		System.out.println(answer);
		
		/**
		1, 5, 10, 20, 40원 
		rest / money[index] 
		39 / 20 = 1
		19 / 10 = 1			
		9 / 5 = 1
		4 / 1 = 4	
		0 
		55
		55 / 40 = 1
		나머지보다 money[i]의 값이 크다면 index증가시킨다. 
		나머지보다 money[i]의 값이 작아지면 index 증가를 중지시키고 나누기 연산을 실행한다. 
		15 / 10 = 1
		5 / 5 = 1
		0
		조건: 나머지가 0이 될 때까지 반복
		
		*/
	}
}