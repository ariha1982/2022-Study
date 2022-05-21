package Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int fac = 1;

        for(int i=1; i<=num; i++){
            fac *= i;
        }
        System.out.println(fac);
    }
}
