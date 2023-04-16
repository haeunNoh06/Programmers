import java.util.Scanner;

class Main {
    
    public static int plus(int a, int b) {
        return a+b;
    }
    
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++ ) 
            System.out.println(a[i]);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int[] A = new int[row];
        for (int i = 0; i < A.length; i++)
            A[i] = plus(scan.nextInt(),scan.nextInt());
        print(A);
    }
}