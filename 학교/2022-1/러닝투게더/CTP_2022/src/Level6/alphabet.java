package Level6;

import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        int[] alphabet = new int[26];
        for (int i=0; i<alphabet.length; i++){
            alphabet[i] = -1;
        }

        for (int i=0; i<a.length(); i++){
            int n = a.charAt(i)-'a';
            alphabet[n] = i;
        }

        for (int i=0; i<alphabet.length; i++){
            System.out.print(alphabet[i] + " ");
        }
        
    }
}
