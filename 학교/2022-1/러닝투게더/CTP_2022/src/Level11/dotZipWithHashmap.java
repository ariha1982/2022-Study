package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class dotZipWithHashmap {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        int[] arr = new int[testcase];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<testcase; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] arr2 = arr.clone();
        Arrays.sort(arr2);

        int count = 0;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr2.length; i++){
            if(!map.containsKey(arr2[i])){
                map.put(arr2[i], count);
                count++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb);
    }
}
