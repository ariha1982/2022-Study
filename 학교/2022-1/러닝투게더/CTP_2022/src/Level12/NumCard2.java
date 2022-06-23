package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumCard2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] card = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(card);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int check = Integer.parseInt(st.nextToken());
			System.out.print(upperSearch(card, check) - lowerSearch(card, check) + " ");
		}
		
		System.out.println();
    }
    public static int lowerSearch(int[] array, int n) {
		int start = 0;
		int end = array.length-1; 
		int mid = 0;

		while (start < end) {
			mid =(start + end) / 2;
            if(array[mid]>=n){
            	end = mid;
            } else {
               start = mid +1;
            }
		}
        return start;
	}
    public static int upperSearch(int[] array, int n) {
		int start = 0;
		int end = array.length-1; 
		int mid = 0;

		while (start < end) {
			mid =(start + end) / 2;
            if(array[mid]<=n){
                start = mid + 1;
            } else {
                end = mid;
            }
		}
        return start;
	}
}
