public class Graph3 {
	int vertices;
	int matrix[][];
	
	Graph3(int vertices) {
		this.vertices = vertices;
		matrix = new int[vertices][vertices];
	}
	
	public void addEdge(int source, int destination) {
		matrix[source][destination] = 1;
		matrix[destination][source] = 1;
	}
	
	public void printGraph() {
		for(int i = 0; i < vertices; i++) {
			for(int j = 0; j < vertices; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void graph3Demo() {
		int v = 5;
		
		Graph3 graph = new Graph3(v);
		
		graph.addEdge(0, 1);
		graph.addEdge(3, 0);
		graph.addEdge(3, 2);
		graph.addEdge(4, 2);
		
		graph.printGraph();
	}
}
