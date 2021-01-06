import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph2<K, E> {

	private Map<K, List<Node<K,E>>> G = null;
	
	public Graph2() {
		G = new HashMap<>();
	}
	
	
	public boolean addEdge(K v1, K v2, E edgeLabel) {
		
		if (!G.containsKey(v1)) {
			G.put(v1, new LinkedList<>());
		}
		
		G.get(v1).add(new Node<>(v1,v2,edgeLabel));
		
		return true;
	}
	
	// Can make graph undirected as well!
	public boolean addUndirectedEdge(K v1, K v2, E edgeLabel) {
		addEdge(v1, v2, edgeLabel);
		addEdge(v2, v1, edgeLabel);
		
		return true;
	}
	
	public String toString() {
		String data = "";
		for(K key : G.keySet()) {
			data += key + " ==> [ " + G.get(key) + " ]\n"; 
		}
		
		return data;
	}
	
	public static void graph2Demo() {
			Graph2<String, String> g = new Graph2<>();
			
			g.addEdge("A", "B", "Children");
			g.addEdge("A", "C", "Brother");
			
			g.addEdge("B", "C", "Aunty");
			
			g.addUndirectedEdge("D", "E", "None");
			System.out.println(g);
	}
	
	@SuppressWarnings("hiding")
	public class Node<K, E> {
		
		private K key = null;
		
		private K endNode = null;
		
		private E edgeLabel = null;

		public Node(K key, K endNode, E edgeLabel) {
			this.key = key;
			this.endNode = endNode;
			this.edgeLabel = edgeLabel;
		}

		@Override
		public boolean equals(Object node1) {
			return key.equals(node1);
		}
		
		@Override
		public int hashCode() {
			return key.hashCode();
		}
		
		public String toString() {
			return "{ key: " + key + " , endNode: "+ endNode + ", edgeLabel: " + edgeLabel + " }";
		}
	}
}

