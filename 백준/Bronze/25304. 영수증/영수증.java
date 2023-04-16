import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int totalPrice = scan.nextInt();
        int objCnt = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < objCnt; i++) {
            sum += scan.nextInt() * scan.nextInt();
        }
        
        System.out.println((sum == totalPrice ? "Yes" : "No"));
        
    }
}