import java.util.*;
class graph{
    //program to represent an undirected graph using adjacency matrix
    void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of vertices");
        int v=sc.nextInt();
        System.out.println("Enter the no. of edges");
        int e=sc.nextInt();
        int adj[][]=new int[v][v];
        for(int i=0;i<e;i++){
            System.out.println("Enter the end points(vertices) of edge "+(i+1));
            int a=sc.nextInt();
            int b=sc.nextInt();
            adj[a][b]=1;
            adj[b][a]=1;
        }
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }

    }
}