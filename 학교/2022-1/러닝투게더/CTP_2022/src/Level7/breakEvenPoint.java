package Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class breakEvenPoint {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int fix = Integer.parseInt(st.nextToken());
        int variable = Integer.parseInt(st.nextToken());
        int income = Integer.parseInt(st.nextToken());

        if(variable>=income){
            System.out.println("-1");
        } else {
            System.out.println(fix/(income-variable)+1);
        }
    }
    
}