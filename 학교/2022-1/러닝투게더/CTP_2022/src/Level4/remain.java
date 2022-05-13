package Level4;

import java.util.Scanner;

public class remain {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner s = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            int num = s.nextInt();
            arr[i] = num%42;
        }
        
        for(int j=0; j<arr.length; j++){
            for(int k=j+1; k<arr.length; k++){
                if(arr[j] == arr[k]){
                    arr[j] = 43;
                }
            }
        }

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 43){
                count += 1;
            }
        }

        System.out.println(10-count);


    }
}
//커밋 메세지 수정