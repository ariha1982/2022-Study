package Level7;

import java.util.Scanner;

public class apartment {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int testCase = s.nextInt();
        
        for(int i=0; i<testCase; i++){
            System.out.println(sumPerson());
        }
    }

    public static int sumPerson(){
        int floor = s.nextInt();
        int room = s.nextInt();

        int[][] home = new int[floor+1][room+1];

        for (int i=1; i<=room; i++){
            home[0][i] = i;
        }
        
        for(int i=1; i<=floor; i++){
            for(int j=1; j<=room; j++){
                home[i][j] = home[i][j-1] + home[i-1][j];
            }
        }
        return home[floor][room];
    }
}
