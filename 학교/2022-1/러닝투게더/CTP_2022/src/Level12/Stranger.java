package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Stranger {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int noneHeard = Integer.parseInt(st.nextToken());
        int noneSee = Integer.parseInt(st.nextToken());

        String[] noneHeardList = new String[noneHeard];
        for(int i=0; i<noneHeard; i++){
            noneHeardList[i] = br.readLine();
        }

        String[] noneSeeList = new String[noneSee];
        for(int i=0; i<noneSee; i++){
            noneSeeList[i] = br.readLine();
        }

        int count = 0;
        if(noneHeard>noneSee){
            for(int i=0; i<noneHeard; i++){
                String search = noneHeardList[i];
                if(Arrays.asList(noneSeeList).contains(search)){
                    count++;
                    sb.append(search + "\n");
                }
            }
        } else {
            for(int i=0; i<noneHeard; i++){
                String search = noneSeeList[i];
                if(Arrays.asList(noneHeardList).contains(search)){
                    count++;
                    sb.append(search + "\n");
                }
            }
        }

        System.out.println(count);
        System.out.println(sb.toString());
    }
}
