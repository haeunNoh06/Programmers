import java.util.Scanner;

class Main {
    
    public static int plusOneToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++ )
            sum += i;
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(plusOneToN(scan.nextInt()));
    }
}