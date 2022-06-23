package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringSet {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int answer = 0;
        String[] sSet = new String[N];

        for(int i=0; i<N; i++){
            sSet[i] = br.readLine();
        }

        for(int i=0; i<M; i++){
            String temp = br.readLine();
            for(int j=0; j<N; j++){
                if(sSet[j].equals(temp)){
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}