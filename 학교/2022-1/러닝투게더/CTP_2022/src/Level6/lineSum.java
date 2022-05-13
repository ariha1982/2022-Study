package Level6;

import java.util.Scanner;

public class lineSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        String num2 = s.next();
        int sum = 0;

        for(int i=0; i<num1; i++){
            sum += num2.charAt(i)-'0';
        }

        System.out.println(sum);
    }
}
//커밋 메세지 수정