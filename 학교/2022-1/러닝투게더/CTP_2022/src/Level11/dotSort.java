package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dotSort {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        int[] x = new int[testcase];
        int[] y = new int[testcase];
        //각 값을 입력받아 각각 다른 배열에 저장
        for(int i=0; i<testcase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int xtemp = 0;
        int ytemp = 0;
        //x를 기준으로 정렬
        for(int i=0; i<testcase-1; i++){
            ytemp = y[i];
            xtemp = x[i];
            int j = i;
            for(j=i; j>0 && y[j-1] > ytemp; j--){
                y[j] = y[j-1];
                x[j] = x[j-1];
            }
            y[j] = ytemp;
            x[j] = xtemp;
        }
        //y를 기준으로 정렬
        for(int i=0; i<testcase-1; i++){
            if(x[i]==x[i+1]){
                ytemp = y[i];
                xtemp = x[i];
                int j = i;
                for(j=i; j>0 && y[j-1] > ytemp; j--){
                    y[j] = y[j-1];
                    x[j] = x[j-1];
                }
                y[j] = ytemp;
                x[j] = xtemp;
            }
        }
        for(int i=0; i<testcase; i++){
            System.out.println(x[i] + " " + y[i]);
        }
    }   
}
