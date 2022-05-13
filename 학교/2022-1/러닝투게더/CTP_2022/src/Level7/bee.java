package Level7;

import java.util.Scanner;

public class bee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int N = (num-1)/6+1;
        System.out.println(N);
    }
}
