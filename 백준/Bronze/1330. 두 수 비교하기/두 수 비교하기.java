import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] num = new int[2];
        for (int i = 0; i < num.length; i++)
            num[i] = scan.nextInt();
        
        String answer;
        if (num[0] > num[1]) answer = ">";
        else if ( num[0] < num[1]) answer = "<";
        else answer = "==";
        System.out.println(answer);
    }
} 