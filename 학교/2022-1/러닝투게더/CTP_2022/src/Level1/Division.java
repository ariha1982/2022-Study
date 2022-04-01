package Level1;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("A(단, A>0): ");
        int a = s.nextInt();

        System.out.print("B(단, B<10): ");
        int b = s.nextInt();

        System.out.println("A / B = " + (a/b));
    }
}
