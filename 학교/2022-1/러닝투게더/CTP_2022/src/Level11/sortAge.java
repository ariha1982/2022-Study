package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class sortAge {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int testcase = Integer.parseInt(br.readLine());

        String[][] arr = new String[testcase][2];
        for(int i=0; i<testcase; i++){
            String[] str = br.readLine().split(" ");
            arr[i][0] = str[0];
            arr[i][1] = str[1];
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2){
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
            
        for(int i=0; i<testcase; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
