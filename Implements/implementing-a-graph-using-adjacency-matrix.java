Adjacency Matrix in Java
      //An adjacency matrix is a square matrix used to represent a finite graph. 
      //The elements of the matrix indicate whether pairs of vertices are adjacent or not - 
      //we will use the value 1 for adjacent vertices, 0 - for not adjacent ones. 
      
      //If the graph is undirected, the adjacency matrix is symmetric.

      //Our class will have the following structure:
class AdjacencyMatrix {
    static class Graph {
        int V;
        int[][] adjMatrix;

        Graph(int V) {
            this.V = V;
            adjMatrix = new int[V][V];
        }
        void addEdge(int src, int dest) {
            adjMatrix[src-1][dest-1] = 1;
        }
        void removeEdge(int src, int dest) {
            adjMatrix[src-1][dest-1] = 0;
        }
        void print() {
            for(int j = 0; j < V; j++) {
                for(int k = 0; k < V; k++)
                    System.out.print(adjMatrix[j][k]+" ");
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
    
        Graph G = new Graph(5);

        G.addEdge(1, 2);
        G.addEdge(1, 5);
        G.addEdge(2, 3);
        G.addEdge(2, 4);
        G.addEdge(2, 5);
        G.addEdge(3, 4);
        G.addEdge(4, 5);
    
        G.print();
  }
}

      //We store the matrix in a two-dimensional array, called adjMatrix.
      //We created a Graph class and defined the corresponding addEdge(), removeEdge() and print() methods.
      
    /*Edge: one line
      Vertice: a point 
      Adjacent vertices: two vertices that one edge(edge that is part of the matrix) connects them

      So the implementation is like this:
      If matrix[a][b] = 1, so a adjacent to b. 
      If matrix[a][b] = 0, so a is not adjacent to b.*/
      
      
      
