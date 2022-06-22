package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class dotZip {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        int[] arr = new int[testcase];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<testcase; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int[] delDup = Arrays.stream(arr).distinct().toArray();

        int[] arr2 = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delDup.length; j++){
                if(arr[i]>delDup[j]){
                    arr2[i]++;
                }
            }
        }

        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
