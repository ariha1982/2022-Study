package Level12;

import java.util.Arrays;
import java.util.Scanner;

public class NumCard {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		int[] card = new int[N];
		for(int i = 0; i < N; i++) {
			card[i] = input.nextInt();
		}
		
		int M = input.nextInt();
		int[] check = new int[M];
		for(int i = 0; i < M; i++) {
			check[i] = input.nextInt();
		}
		
		Arrays.sort(card);
		
		for(int i = 0; i < M; i++) {
			System.out.print(binarySearch(card, check[i]) + " ");
		}
		
		System.out.println();
		
		input.close();
	}
	public static int binarySearch(int[] array, int n) {
		int start = 0;
		int end = array.length-1; 
		int mid = 0;

		while (start <= end) {
			mid = (start + end) / 2;
			if(array[mid] == n) {
				return 1;
				
			}else {
				if(array[mid] < n) {
					start = mid+1;
				}else {
					end = mid-1;
				}
			}
		}
		return 0;
	}
}
