package Level3;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("얼마까지 더할까? ");
        int num = s.nextInt();

        int sum = 0;
        for(int i = 1; i < num+1; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
