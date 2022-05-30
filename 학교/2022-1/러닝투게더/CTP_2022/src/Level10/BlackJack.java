package Level10;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int check = Integer.parseInt(st.nextToken());

        int[] arr = new int[num];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<num; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }

        int sum = 0;
        int ans = 0;
        for(int j=0; j<arr.length; j++){
            for(int k=j+1; k<arr.length; k++){
                for(int l=k+1; l<arr.length; l++){
                    sum = arr[j] + arr[k] + arr[l];
                    if(sum<=check){
                        if(sum>ans){
                            ans = sum;
                        }
                    } 
                }
            }
        }

        System.out.println(ans);
    }
}
