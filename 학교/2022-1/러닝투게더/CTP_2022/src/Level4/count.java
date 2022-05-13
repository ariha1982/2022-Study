package Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class count {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int sum = A*B*C;

        int[] arr = new int[10];
        while(sum>0){
            arr[sum%10]++;
            sum /= 10;
        }
        
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        br.close();
    }
}
