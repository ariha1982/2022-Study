package Level2;
import java.util.Scanner;

public class ThreeDice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("주사위1: ");
        int d1 = s.nextInt();

        System.out.print("주사위2: ");
        int d2 = s.nextInt();

        System.out.print("주사위3: ");
        int d3 = s.nextInt();

        int prize = 0;
        if (d1 == d2 && d2 == d3) {
            prize = 10000 + d1*1000;
        } else if (d1 == d2 || d1 == d3) {
            prize = 1000 + d1 * 100;
        } else if (d2 == d3) {
            prize = 1000 + d2 * 100;
        } else {
            if ( d1 > d2 && d1 > d3) {
                prize = d1 * 100;
            } else if ( d2 > d3 && d2 > d1){
                prize = d2 * 100;
            } else {
                prize = d3 * 100;
            }
        }
        System.out.println(prize);
    }
}
