import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] num = new int[3];
        for (int i = 0; i < num.length; i++)
            num[i] = scan.nextInt();
        
        System.out.println((num[0]+num[1])%num[2]);
        System.out.println(((num[0]%num[2]) + (num[1]%num[2]))%num[2]);
        System.out.println((num[0]*num[1])%num[2]);
        System.out.println(((num[0]%num[2]) * (num[1]%num[2]))%num[2]);
    }
}