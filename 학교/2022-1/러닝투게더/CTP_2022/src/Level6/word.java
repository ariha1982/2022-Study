package Level6;

import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.toUpperCase();

        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++){
            arr[i] = 0;
        }

        for(int i=0; i<str.length(); i++){
            int n = str.charAt(i)-'A';
            arr[n] += 1;
        }

        int count = 0;
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > count){
                count = arr[i];
                index = i;
            } else if (arr[i] == count){
                index = -1;
            }
        }

        if(index == -1){
            System.out.println("?");
        }else{
            System.out.println((char)(index+65));
        }
    }
}
