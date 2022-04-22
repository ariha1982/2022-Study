package Level3;

import java.util.Scanner;

public class AddCycle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int initNum = s.nextInt();
        s.close();

        int count = 0;
        int newNum = initNum;
        int a = initNum/10;
        int b = initNum%10;

        while(true){
            newNum = b*10 + ((a + b)%10);
            count++;

            if(initNum == newNum){
                break;
            }
        }
        System.out.println(count);
    }//맞게 한거 같은데 왜 실행이 안되지..

}
