package Level1;
import java.util.Scanner;

public class ComplexMultiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("A(단, A는 세자리수): ");
        int a = s.nextInt();

        System.out.print("B(단, B는 세자리수): ");
        int b = s.nextInt();
        int c = b%10;
        int d = (b-c)/10%10;
        int e = (b - (10*d+c))/100;

        System.out.println(a*c);
        System.out.println(a*d);
        System.out.println(a*e);
        System.out.println(a*c + a*d*10 + a*e*100);

    }
}
