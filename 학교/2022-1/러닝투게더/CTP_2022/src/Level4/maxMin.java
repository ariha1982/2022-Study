package Level4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.*;

public class maxMin {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrayNum = Integer.parseInt(br.readLine());
        int[] arr = new int[arrayNum];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<arrayNum; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        bw.write(min + " " + max);
        bw.close();
        br.close();
    }
}
//커밋 메세지 수정
