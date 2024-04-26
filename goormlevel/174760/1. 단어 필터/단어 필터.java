import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String S = br.readLine();
		String E = br.readLine();
		
		System.out.println(isContained(S, E));
	}
	
	public static String isContained(String S, String E) {
		// System.out.println("--------------------------");
		// System.out.println("막 들어왔을 때 S: "+S+", E: "+E);
		// E = E.replace(S, "");
		// System.out.println("E.length(): "+E.length());
		// System.out.println("replaceAll 됐을 때 S: "+S+", E: "+E);
		while ( E.contains(S) ) {
			//System.out.println("재귀함수 호출할 때 S: "+S+", E: "+E);
			// new StringBuffer(E).delete(E.lastIndexOf(S), S.length());
			E = E.replace(S, "");
			if ( E.length() == 0 || E.equals("") || E.equals(S)) {
				// System.out.println("empty가 됐을 때 S: "+S+", E: "+E);
				return "EMPTY";
			}
		}
		// System.out.println("문자열 제거 완료됐을 때 S: "+S+", E: "+E);
		return E;
	}
}