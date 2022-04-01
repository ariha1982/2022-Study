package Level2;
import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("x좌표(단, 1000<=x<=1000; x!=0): ");
        int x = s.nextInt();

        System.out.print("y좌표(단, 1000<=y<=1000; y!=0): ");
        int y = s.nextInt();

        if ( x > 0){
            if (y > 0) {
                System.out.println("1사분면");
            } else if (y < 0) {
                System.out.println("4사분면");
            }
        } else if (x < 0) {
            if (y > 0) {
                System.out.println("2사분면");
            } else if (y < 0) {
                System.out.println("3사분면");
            }
        }
    }
}
