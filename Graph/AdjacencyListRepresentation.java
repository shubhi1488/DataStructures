import java.util.LinkedList;

public class AdjacencyListRepresentation {
    private  LinkedList<Integer>[]adj;
    private int V;
    private int E;
    public AdjacencyListRepresentation(int nodes){
        this.V=nodes;
        this.E=0;
        this.adj=new LinkedList[nodes];
        for (int v=0;v<V;v++){
            adj[v]=new LinkedList<>();
        }
    }
    public void addEdge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
        E++;
    }
    public void print(){

    }

    public static void main(String[] args) {
        AdjacencyListRepresentation alr=new AdjacencyListRepresentation(4);
        alr.addEdge(0,1);
        alr.addEdge(1,2);
        alr.addEdge(2,3);
        alr.addEdge(3,0);
        System.out.println(alr);
    }
}
