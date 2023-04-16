import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] A = new int[3];
        for (int i = 0; i < 3; i++) 
            A[i] = scan.nextInt();
        
        int money = 0;
        
        if ( A[0] != A[1] && A[0] != A[2] && A[1] != A[2] ) {
        	int max = A[0];
        	for (int i = 1; i < A.length; i++) {
        		max = Math.max(max, A[i]);
        	}	
        	money = max*100;
        }
        else if ( A[0] != A[1] || A[0] != A[2] || A[1] != A[2] ) {
            
            if (A[0] == A[1])
                money = 1000+A[0]*100;
            else if (A[0] == A[2])
                money = 1000+A[0]*100;
            else
                money = 1000+A[1]*100;
        }
        else {
            money = 10000+A[0]*1000;
        }
        System.out.println(money);
    }
}