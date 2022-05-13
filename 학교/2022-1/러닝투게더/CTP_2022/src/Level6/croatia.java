package Level6;

import java.util.Scanner;

public class croatia {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        str = str.replace("c=", "*");
        str = str.replace("c-", "*");
        str = str.replace("dz=", "*");
        str = str.replace("d-", "*");
        str = str.replace("lj", "*");
        str = str.replace("nj", "*");
        str = str.replace("s=", "*");
        str = str.replace("z=", "*");

        System.out.println(str.length());
    }
}
//커밋 메세지 수정