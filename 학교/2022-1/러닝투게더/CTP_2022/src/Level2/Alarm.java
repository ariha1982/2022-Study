package Level2;
import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("시: ");
        int H = s.nextInt();

        System.out.print("분: ");
        int M = s.nextInt();

        if(M - 45 < 0) {
            if (H == 0) {
                H = 23;
                M = 60 + (M - 45);
                System.out.println(H + " " + M);
            } else {
                H = H-1;
                M = 60 + (M - 45);
                System.out.println(H + " " + M);
            }
        } else {
            M = M -45;
            System.out.println(H + " " + M);
        }
    }
}

//버퍼 리더 -> 효율적
//스캐너 메모리가 17000~18000 나오는데 버퍼 쓰면 15000으로 줄음