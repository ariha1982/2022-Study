package Level2;
import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("A(단, -10000<=A<=10000): ");
        int a = s.nextInt();

        System.out.print("B(단, -10000<=A<=10000): ");
        int b = s.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
