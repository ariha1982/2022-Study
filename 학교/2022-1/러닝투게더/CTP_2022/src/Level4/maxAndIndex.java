package Level4;

import java.util.Arrays;
import java.util.Scanner;

public class maxAndIndex {
    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner s = new Scanner(System.in);

        for (int i=0; i<9; i++) {
            int num = s.nextInt();
            arr[i] = num;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int count = 0;

        for(int j=0; j<arr.length; j++){
            if(arr[j]!=max){
                count = count+1;
            }
        }

        System.out.println(max);
        System.out.println(count);

    }

    //똑같이 입력하면 잘 출력되는데 백준에 넣으면 틀렸다고 뜸;;
}
