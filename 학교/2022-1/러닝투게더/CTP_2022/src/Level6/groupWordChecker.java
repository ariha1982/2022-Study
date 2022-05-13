package Level6;

import java.util.Scanner;
//나중에 다시 해보기
public class groupWordChecker {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int testCase = s.nextInt();
        int count = 0;

        for(int i=0; i<testCase; i++){
            if(check() == true){
                count++;
            }
            System.out.println(count);
        }
    }

    public static boolean check() {
        boolean[] check = new boolean[26];
        int pre = 0;
        String str = s.next();

        for(int i=0; i<str.length(); i++){
            int now = str.charAt(i);

            if(pre != now){
                if(check[now-'a'] == false){
                    check[now-'a'] = true;
                    pre = now;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}
//커밋 메세지 수정
