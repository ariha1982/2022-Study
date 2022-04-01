package Level1;
import java.util.Scanner;

public class YearCalculate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("불기연도 입력: ");
        int BuddhistYear = s.nextInt();

        System.out.println("서기 연도: " + (BuddhistYear-544));
    }
}
