package Level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class 분해합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int min = 10000;
        for(int i=100; i<num; i++){
            int a = i%10;
            int b = i/100;
            int c = (i-b*100-a)/10;

            if(i+a+b+c == num && i+a+b+c < min){
                min = i;
            }
        }

        System.out.println(min);
    }
}
