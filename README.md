# Coding-test-java

## 입출력
### Scanner
```java
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
long l = sc.nextLone();
String s = sc.next();
String s = sc.nextLine();
```

### BufferedReader
```java
import java.io.*;
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
}
```

### ex)
```java
in:
3
0 3
1 5
45 50

Scanner sc = new Scanner(System.in);
int T = sc.nextInt();
for(int i = 0; i < T; i++){
    int X=sc.nextInt();
    int Y=sc.nextInt();
}
        
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int T = Integer.parseInt(br.readLine());
long[] startPoint = new long[T];
long[] endPoint = new long[T];
for(int i = 0 ; i<T ; i++ ){
    StringTokenizer st=new StringTokenizer(br.readLine()," ");
    startPoint[i]=Integer.parseInt(st.nextToken());
    endPoint[i]=Integer.parseInt(st.nextToken());
}
```

## Linked List
```java
import java.util.LinkedList;
LinkedList<Integer> arr = new LinkedList<Integer>();
```
### Methods
#### 삽입
- `add([value])`
- `add(index, [value])`

#### 변경
- `set(index, [value])`

#### 제거
- `remove([value])`
- `remove(index)`

#### 값 존재 확인
- `boolean contains = arr.contains([value]);`
- `int index = arr.indexOf([value])`


## Heap
```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(\
        (Integer o1, Integer o2) -> (-Ingeger.compare(o1,o2)));
```
- add
- poll
- peek
- remove

## Djikstra
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
        for (int i=0; i<10000; i++) graph.add(new ArrayList<Node>());

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new Node(b, c));
        }

        int[] dist = new int[10000];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Node> q = new PriorityQueue<>();
        q.add(new Node(0,0));
        dist[0] = 0;
        while (!q.isEmpty()) {
            Node cur = q.poll();
            if (dist[cur.dest] == cur.cost) {
                for (Node next : graph.get(cur.dest)) {
                    if (dist[next.dest] > next.cost + cur.cost) {
                        dist[next.dest] = next.cost + cur.cost;
                        q.add(new Node(next.dest, dist[next.dest]));
                    }
                }
            }
        }
        System.out.println(dist[50]);
    }

    static class Node implements Comparable<Node>{
        int dest;
        int cost;
        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node node) {
            return Integer.compare(this.cost, node.cost);
        }
    }
}
```