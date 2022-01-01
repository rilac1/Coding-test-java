import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        int[][] graph = new int[D];

        for (int i=0; i<N; i++) {
            String[] input2 = br.readLine().split(" ");
            graph[input2[0]]
            }
    }

    class Node {
        private int dest;
        private int cost;
        public Node(int d, int c) {
            dest = d;
            cost = c;
        }
    }
}