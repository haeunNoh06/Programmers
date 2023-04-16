import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
     
        if ( minute-45 < 0 )  {
            minute = (minute+60)-45;
            
            if (hour == 0) {
                hour = 24;
            }
            hour--;
        }
        else {
            minute -= 45;
        }
        System.out.println(hour+" "+minute);
    }
}