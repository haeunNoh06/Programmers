import java.io.*;
import java.util.*;
import java.util.stream.*;
class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int[] input = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      Queue<Integer> queue = new LinkedList<Integer>();
      String[] order = new String[input[0]];
      List<String> answer = new ArrayList<>();
      
      for ( int i = 0; i < order.length; i++ ) {
         order[i] = br.readLine();
      }
      
      for(int i=0; i<order.length; i++){
            if(order[i].contains("push")){
               if(queue.size() >= input[1])
                  answer.add("Overflow");
               else{
                  int num = Integer.parseInt(order[i].substring(5));
                  queue.add(num);
               }
            }
            else if(order[i].contains("pop")){
               if(queue.size() == 0)
                  answer.add("Underflow");
               else{
                  answer.add(""+queue.remove());
               }
            }
         }
         for(int i=0; i<answer.size(); i++){
            System.out.println(answer.get(i));
         }
   }
}