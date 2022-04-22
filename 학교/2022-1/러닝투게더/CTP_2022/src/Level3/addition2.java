package Level3;

import java.util.Scanner;

public class addition2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("테스트 케이스의 개수: ");
        int testCase = s.nextInt();
        for(int i = 0; i<testCase; i++){
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println(a+b);
        }
    }
}
