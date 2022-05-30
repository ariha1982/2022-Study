package Level10;

import java.util.Scanner;

public class shom {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int start = 666;
		int i=1;
		
		while(i<=N) {
			String cmp = ""+start;
			start++;
			if(cmp.contains("666")) {
				i++;
			}
		}
		
		System.out.println(start-1);
	}

}
