package Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bbefore = 0;
        int before = 1;
        int now = 0;
        int count = Integer.parseInt(br.readLine());

        for(int i=0; i<count; i++){
            if(count==0){
                now = bbefore;
            } else if(count==1){
                now = before;
            } else if(count==2){
                now = bbefore+before;
            } else {
                bbefore = before;
                before = now;
                now = bbefore + before;
            }
        }
        System.out.println(now);
    }
}
