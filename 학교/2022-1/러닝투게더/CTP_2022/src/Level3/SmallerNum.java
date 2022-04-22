package Level3;

import java.util.Scanner;

public class SmallerNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int X = s.nextInt();

        int i;
        int arr[];
        arr = new int[N];
        for(i=0; i<N; i++){//크기가 N인 배열에 랜덤한 수 넣기
            arr[i] = (int)(Math.random()*N+1);
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    i--;
                }
            }
        }

        for(i=0; i<arr.length; i++){ //전체 배열 출력
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");

        for(i=0; i<arr.length; i++){//조건에 맞는 값 출력
            if (arr[i] < X){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
