package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

//n=포켓몬개수, m=문제개수
//문제가 숫자면 해당 인덱스 포켓몬을, 문제가 문자면 해당 포켓몬 인덱스를
public class PocketmonMaster {
    public static void main(String[] args) throws IOException{
        HashMap<Integer, String> nameQ = new HashMap<Integer, String>();
        HashMap<String, Integer> indexQ = new HashMap<String, Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            String poketmon = br.readLine();
            nameQ.put(i, poketmon);
            indexQ.put(poketmon, i);
        }

        for(int i=0; i<M; i++){
            String s = br.readLine();

            if(Character.isDigit(s.charAt(0))){
                int num = Integer.parseInt(s);
                System.out.println(nameQ.get(num));
            } else {
                System.out.println(indexQ.get(s));
            }
        }
    }
}
