package Level2;
import java.util.Scanner;

public class OvenTimer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("H(0<=H<=23): ");
        int H = s.nextInt();

        System.out.print("M(0<=M<=59): ");
        int M = s.nextInt();

        System.out.print("요리 시간(<=1000): ");
        int CookingTime = s.nextInt();

        H += CookingTime/60;
        M += CookingTime%60;
        if (M >= 60) {
            H += 1;
            M -= 60;
            if (H > 23) {
                H -= 24;
            } 
        } else {
            if (H > 23) {
                H -= 24;
            }
        }
    }
}
