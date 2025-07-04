import java.util.*;
import java.util.LinkedList;

public class Graph {
    int vertices;
    LinkedList<Integer>[]adjList;

    Graph(int v){
        vertices=v;
        adjList=new LinkedList[v];

        for(int i=0;i< v;i++){
            adjList[i] =new LinkedList<>();
        }
    }
    void addEdge(int src,int dest){
        adjList[src].add(dest);
       // adjList[dest].add(src);
    }
    void printGraph(){
        for(int i=1;i<vertices;i++){
            System.out.println("vertex: "+ i + " connected to :" );
            for(Integer node: adjList[i]){
                System.out.println(node + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Graph graph=new Graph(5);

        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(4,5);
        graph.addEdge(1,4);
        graph.addEdge(2,5);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(3,5);


        graph.printGraph();


    }
}
