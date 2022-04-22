package Level3;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class 구구단 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("몇 단을 출력할까? ");
        int num = s.nextInt();

        for(int i=1; i<10; i++) {
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }
}