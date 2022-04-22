package Level3;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class star2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int star = Integer.parseInt(br.readLine());
        
        for(int i=1; i<star+1; i++){
            int blank = star-i;
            for (int j = 1; j < blank+1; j++){
                bw.write(" ");
            }
            for (int k = 1; k<i+1; k++){
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.close();
        br.close();
    }
}
