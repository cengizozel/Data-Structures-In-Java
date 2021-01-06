import java.util.LinkedList;

public class Graph1 {
	
	class Edge {
		int v,w;
		public Edge(int v, int w) {
			this.v = v;
			this.w = w;
		}
		@Override
		public String toString() {
			return "("+v+","+w+")";
		}
	}
	LinkedList<Edge> G[];
	@SuppressWarnings("unchecked")
	public Graph1(int n) {
		G = new LinkedList[n];
		for(int i = 0; i < G.length; i++) {
			G[i] = new LinkedList<Edge>();
		}
	}
	
	public void addEdge(int u, int v, int w) {
		G[u].add(0, new Edge(v,w));
	}
	
	public boolean isConnected(int u, int v) {
		for(Edge i: G[u]) {
			if(i.v==v) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i = 0; i < G.length; i++) {
			result = result + i + "==>" + G[i] + "\n";
		}
		return result;
	}
	
	public static void graph1Demo() {

		Graph1 g = new Graph1(10);
		
		g.addEdge(0, 2, 10);
		g.addEdge(5, 6, 7);
		
		System.out.println(g);
		
		System.out.println(g.isConnected(5, 6));
		
	}	
}
