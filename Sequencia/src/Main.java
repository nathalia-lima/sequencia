import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int  b;
        int d;
        d = 0;
        while(true) {
            a = input.nextInt();
            b = input.nextInt();
            if(a <= 0 || b <= 0) {
                break;
            } else {
                d = 0;
                if(a < b) {
                    for(int c = a; c <= b; c++) {
                        System.out.print(c + " ");
                        d += c;
                    }
                    System.out.println("Sum=" + d);
                } else if(a > b) {
                    for(int c = b; c <= a; c++) {
                        System.out.print(c + " ");
                        d += c;
                    }
                    System.out.println("Sum=" + d);
                }
            }
        }
    }
}