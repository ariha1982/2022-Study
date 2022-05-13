package Level6;

import java.util.Scanner;

import Level5.selfNum;

public class dial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int[] alphabet = new int[26];

        for(int i=0; i<alphabet.length; i++){
            if (i<3) {
                alphabet[i] = 3;
            } else if (i<6) {
                alphabet[i] = 4;
            } else if (i<9) {
                alphabet[i] = 5;
            } else if (i<12) {
                alphabet[i] = 6;
            } else if (i<15){
                alphabet[i] = 7;
            } else if (i<19) {
                alphabet[i] = 8;
            } else if(i<22){
                alphabet[i] = 9;
            } else if (i<26){
                alphabet[i] = 10;
            }
        }

        int sum=0;
        for(int i=0; i<str.length(); i++){
            sum += alphabet[str.charAt(i)-'A'];
        }

        System.out.println(sum);
    }
}
