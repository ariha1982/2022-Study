package Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recursive {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        answer(0, repeat);
    }
    
    public static void answer(int n, int repeat){
        String front = "";
        for(int i=0; i<n; i++){
            front+="----";
        }
        if(repeat == n){
            System.out.println(front+"\"재귀함수가 뭔가요?\"");
            System.out.println(front+"\"재귀함수는 자기 자신을 호출하는 함수라네.\"");
            System.out.println(front+"라고 답변하였지");
            return;
        }
        System.out.println(front+"\"재귀함수가 뭔가요?\"");
        System.out.println(front+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(front+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(front+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와 물었어\"");
        answer(n+1, repeat);
        System.out.println(front+"라고 답변하였지.");
    }
}
