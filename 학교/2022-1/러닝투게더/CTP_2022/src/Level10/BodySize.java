package Level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import Level3.star1;

public class BodySize {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        int[] w = new int[testcase];
        int[] h = new int[testcase];
        int[] rank = new int[testcase];
        for(int i=0; i<testcase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            w[i] = weight;
            h[i] = height;
        }

        for(int i=0; i<w.length; i++){
            for(int j=i+1; j<h.length; j++){
                if(w[i]>w[j] && h[i]>h[j]){
                    rank[j]++;
                } else if (w[i]<w[j] && h[i]<h[j]){
                    rank[i]++;
                }
            }
        }

        for(int i=0; i<rank.length; i++){
            System.out.print(rank[i]+1 + " ");
        }
    }
}
