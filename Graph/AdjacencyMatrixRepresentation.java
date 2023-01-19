public class AdjacencyMatrixRepresentation {
    int [][]adjmatrix;
    public AdjacencyMatrixRepresentation(int node){
        this.adjmatrix=new int[node][node];
    }
    public void addEdge(int u,int v){
        adjmatrix[u][v]=1;
        adjmatrix[v][u]=1;
    }
    public void print(int[][]adjmatrix){
        for(int i=0;i<adjmatrix.length;i++){
            for (int j=0;j<adjmatrix.length;j++){
                System.out.print(adjmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrixRepresentation amr=new AdjacencyMatrixRepresentation(4);
        amr.addEdge(0,1);
        amr.addEdge(1,2);
        amr.addEdge(2,3);
        amr.addEdge(3,0);
        amr.print(amr.adjmatrix);

    }

}
