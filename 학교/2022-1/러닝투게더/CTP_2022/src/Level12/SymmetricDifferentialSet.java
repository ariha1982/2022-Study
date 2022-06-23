package Level12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class SymmetricDifferentialSet {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        HashSet<Integer> setA = new HashSet<Integer>();
        HashSet<Integer> setB = new HashSet<Integer>();
        HashSet<Integer> temp = new HashSet<Integer>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<a; i++){
            setA.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<b; i++){
            setB.add(Integer.parseInt(st.nextToken()));
        }

        temp.addAll(setA);
        setA.removeAll(setB);
        setB.removeAll(temp);

        System.out.println(setA.size()+setB.size());
    }
}
