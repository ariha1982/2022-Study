package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class sortInside {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = num1;
        int count = 0;
        while (num2 != 0){
            count++;
            num2 /= 10;
        }

        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = num1%10;
            num1 /= 10;
        }

        Arrays.sort(arr);

        for(int i=arr.length-1; i>-1; i--){
            System.out.print(arr[i]);
        }
    }

}
