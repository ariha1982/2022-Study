package Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import Level3.star1;

public class repeat {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i=0; i<testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int reNum = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            repeat(reNum, str);
        }
        
    }

    private static void repeat(int n, String str){
        for(int i=0; i<str.length(); i++){
            char ch1 = str.charAt(i);
            for(int j=0; j<n; j++){
                System.out.print(ch1);
            }
        }
        System.out.print("\n");
    }
}
