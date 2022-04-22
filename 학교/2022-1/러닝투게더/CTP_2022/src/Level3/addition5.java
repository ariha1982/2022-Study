package Level3;

import java.util.Scanner;

public class addition5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int a = s.nextInt();
            int b = s.nextInt();

            if(a == 0 && b == 0){
                break;
            }
            System.out.println(a+b);
        }
        
    }
}
