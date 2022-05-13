package Level6;

import java.util.Scanner;

public class wordCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String arr[] = str.split(" ");

        System.out.println(arr.length);
    }
}
