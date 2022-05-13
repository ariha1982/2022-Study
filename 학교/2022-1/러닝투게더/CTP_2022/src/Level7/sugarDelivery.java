package Level7;

import java.util.Scanner;

import Level4.count;

public class sugarDelivery {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sugar = s.nextInt();

        int count = sugar/5 + (sugar%5)/3;

        if((sugar%5)%3 != 0){
            count = -1;
        }

        System.out.println(count);
    }
}
