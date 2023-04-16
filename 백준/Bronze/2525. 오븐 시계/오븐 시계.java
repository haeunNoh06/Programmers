import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();// 요리에 필요한 시간(necessary)
        
        int minute = A*60+B+C;// 시로 변환
        int hour = (minute/60)%24;
        System.out.println(hour+" "+minute%60);
    }
}