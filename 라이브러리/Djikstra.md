```java
import java.util.*;

class Node implements Comparable<Node>{
    int destination;
    int weight;

    public Node(int destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node node) {
        return Integer.compare(this.weight, node.weight);
    }
}

class Graph {
    int mapLength;
    private ArrayList<Node> map = new ArrayList<ArrayList<Node>>();
    public Graph(int mapLength) {
        this.mapLength = mapLength;
        for (int i=0; i<this.mapLength+1; i++)
            map.add(new ArrayList<Node>());
    }

    public void input(int origin, int destination, int weight) {
        graph.get(origin).add(new Node(destintion, weight));
    }
    
    public int[] dijkstra(int origin) {
        private int[] distance = new int[mapLength+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        PriorityQueue<Node> heap = new PriorityQueue<>();
        heap.add(new Node(origin,0));
        distance[origin] = 0;
        while (!heap.isEmpty()) {
            Node current = heap.poll();
            if (current.weight != distance[current.destination])
                continue;
            for (Node next : map.get(current.destination)) {
                if (distance[next.destination] > distance[current.destination] + next.weight) {
                    distance[next.destination] = distance[current.destination] + next.weight;
                    heap.add(new Node(next.destination, distance[next.destination]));
                }
            }
        }
        return distance;
    }
}
```