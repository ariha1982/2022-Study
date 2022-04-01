package Level1;
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("A(단, 2<=A<=10000): ");
        int a = s.nextInt();

        System.out.print("B(단, 2<=B<=10000): ");
        int b = s.nextInt();

        System.out.print("C(단, 2<=C<=10000): ");
        int c = s.nextInt();

        System.out.println("(A + B) % C = " + (a+b)%c);
        System.out.println("(A % C) + (B % C) = " + ((a%c)+(b%c)));
        System.out.println("(A * B) % C = " + (a*b)%c);
        System.out.println("(A % C) + (B % C) = " + ((a%c)*(b%c)));

    }
}
