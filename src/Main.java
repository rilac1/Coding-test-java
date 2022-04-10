import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] target = new int[M];
        for (int i=0; i<M; i++)
            arr[i] = Integer.parseInt(st.nextToken());


    }
}