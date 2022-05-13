package Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class avg {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int subNum = Integer.parseInt(br.readLine());
        int[] arr = new int[subNum];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<subNum; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Arrays.stream(arr).max().getAsInt();
        int sum=0;
        for (int i=0; i<arr.length; i++){
            arr[i] = arr[i]/M*100;
            sum = sum + arr[i];
        }

        double avg = sum/subNum;
        System.out.println(avg);
        br.close();

    }
}
//커밋 메세지 수정
