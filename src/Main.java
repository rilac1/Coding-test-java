import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        LinkedList<Integer> q = new LinkedList<>();
        LinkedList<Integer> target = new LinkedList<>();
        for (int i=1; i<=N; i++) q.add(i);
        for (int i=0; i<M; i++) target.add(sc.nextInt());

        for (int t : target) {
            if (q.get(0)==t) q.remove(0);
            else {
                if t
            }
        }
    }

    static class Dequeue {
        private LinkedList<Integer> data = new LinkedList<>();
        public Dequeue(int n) {
            for (int i=1; i<=n; i++)
                data.add(i);
        }
        public void pop() {

        }
    }
}
