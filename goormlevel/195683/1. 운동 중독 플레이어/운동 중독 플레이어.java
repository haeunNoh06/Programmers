import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int input1 = Integer.parseInt(br.read());
		//int input2 = Integer.parseInt(br.read()); 
		String[] inputs = (br.readLine()).split(" ");

		int[] arr = new int[2];
		for ( int i = 0; i < inputs.length; i++ )
			arr[i] = Integer.parseInt(inputs[i]);
		
		System.out.println((int)(arr[0]*(1+arr[1]/30.0)));
		
		// System.out.println((input1*v1));
	}
}