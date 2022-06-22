package Level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class statistic {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());

        int[] arr = new int[testcase];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<testcase; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(mean(arr, testcase));
        System.out.println(mid(arr));
        //mode(arr);
        System.out.println(range(arr));

    }

    public static int mean(int arr[], int testcase){
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

        int mean = (int)Math.floor(sum/testcase);
        return mean;
    }

    public static int mid(int arr[]){
        Arrays.sort(arr);
        int midNum = (int) Math.floor(arr.length/2);
        return arr[midNum];
    }

    public static int range(int arr[]){
        int range = 0;
        Arrays.sort(arr);
        if(arr[0] < 0){
            range = arr[0]*(-1)+arr[arr.length-1];
        } else {
            range = arr[0] + arr[arr.length-1];
        }
        
        return range;
    }

    public static int mode(int arr[]){
        Arrays.sort(arr);
        int[] count = new int[arr[arr.length-1]];

        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int max = 0;
        int returnIndex = 0;
        ArrayList arrlist = new ArrayList<Integer>(count.length);
        boolean empty = false;
        for(int i=0; i<count.length; i++){
            if(count[i]>max){
                max = count[i];
                arrlist.clear();
                empty = false;
            } else if(count[i]==max){
                arrlist.add(count[i]);
                empty = true;
            } else {
                continue;
            }
        }

        if(empty==true){
            Collections.sort(arrlist);
            returnIndex =  (int) arrlist.get(1);
        } else if(empty==false){
            returnIndex = max;
        }

        return returnIndex;
    } //모르겠음..

}
