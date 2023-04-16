import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int X = scan.nextInt();
        int Y = scan.nextInt();
        int answer;
        
        if ( X > 0) {
            if ( Y > 0 ) answer = 1;
            else answer = 4;
        }
        else {
            if ( Y > 0 ) answer = 2;
            else answer = 3;
        }
        System.out.println(answer);
    }
} 