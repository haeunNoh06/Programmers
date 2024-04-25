import java.io.*;
import java.util.*;
import java.util.stream.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Stack<Integer> stack = new Stack<>();
		String[] order = new String[input[0]];
		for ( int i = 0; i < order.length; i++ ) {
			order[i] = br.readLine();
		}
		
		List<String> list = new ArrayList<>();
		
		for ( int i = 0; i < order.length; i++ ) {
			if ( order[i].contains("push") ) {
				if (stack.size() >= input[1] ) {
					list.add("Overflow");
				}
				else if ( stack.size() < input[1] ) {
					stack.push(Integer.parseInt(order[i].substring(5)));
				}
			} else if ( order[i].equals("pop")) {
				if ( stack.size() <= 0 ) {
					list.add("Underflow");
				} else if ( stack.size() > 0 ) {
					list.add(String.valueOf(stack.pop()));
				}
			}
		}
		for ( String s : list ) {
			System.out.println(s);
		}
	}
}