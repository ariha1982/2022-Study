package Level5;

public class sum {
    long sum(int[] a){
        long sum = 0;

        for (int i=0; i<a.length; i++){
            sum += a[i];
        }

        return sum;
    }
}
//커밋 메세지 수정