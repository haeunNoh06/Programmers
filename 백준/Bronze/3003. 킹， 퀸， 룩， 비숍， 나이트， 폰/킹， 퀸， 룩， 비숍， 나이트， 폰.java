import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] num = new int[6];
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextInt();
        }
        
        System.out.println((1-num[0])+" "+(1-num[1])+" "+(2-num[2])+" "+(2-num[3])+" "+(2-num[4])+" "+(8-num[5]));
    }
}