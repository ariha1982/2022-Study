package Level6;

import java.util.Scanner;

public class numUpsideDown {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] arr = str.split(" ");

        int[] numArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int one = arr[i].charAt(0) - '0';
            int ten = arr[i].charAt(1) - '0';
            int hun = arr[i].charAt(2) - '0';
            
            numArr[i] = hun*100 + ten*10 + one;
        }

        if(numArr[0] > numArr[1]){
            System.out.println(numArr[0]);
        } else if(numArr[1] > numArr[0]){
            System.out.println(numArr[1]);
        }

    }
}
//커밋 메세지 수정
