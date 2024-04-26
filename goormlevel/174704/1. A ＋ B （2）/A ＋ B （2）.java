import java.io.*;
import java.util.stream.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] input = Stream.of(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
		System.out.printf("%.6f", input[0]+input[1]);
	}
}