package Level5;

import java.util.Scanner;

public class hansu {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(hansu(num));  
    }

    public static int hansu(int n){
        int count = 99;

        for(int i=0; i<n; i++){
            if(i<100){
                count += 0;
            } else {
                int a = i/100;
                int b = (i/10)%10;
                int c = i%10;

                if((a-b) == (b-c)){
                    count++;
                }
            }
        }
        return count;
    }
}
//커밋 메세지 수정
