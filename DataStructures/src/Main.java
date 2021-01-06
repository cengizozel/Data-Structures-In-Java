public class Main {
	
	public static void printLine() {
		System.out.println("\n-------------------------------------------------------------------\n");
	}
	
	public static void demo() {
		
		System.out.println("DATA STRUCTURES IN JAVA\n");
		
		// Java native data structures (LinkedList, Stack, Queue)
		System.out.println("Java Native Data Structures\n");
		JavaDS.javaDS_Demo();
		printLine();
		
		// Linked Lists
		System.out.println("LinkedList Implementation\n");
		LinkedList.linkedListImpDemo();
		printLine();
		
		// Stacks
		System.out.println("Stack Implementation\n");
		Stack.stackImpDemo();
		printLine();

		// Queues
		System.out.println("Queue Implementation\n");
		Queue.queueImpDemo();
		printLine();
		
		// Binary Tree
		System.out.println("Binary Tree Implementation\n");
		BinaryTree.btDemo();
		printLine();
		
		// NonBinary Tree
		System.out.println("NonBinary Tree Implementation\n");
		NonbinaryTree.nbtDemo();
		printLine();
		
		// Hash Table
		System.out.println("Hash Table\n");
		HashTable.hashtableDemo();
		printLine();
		
		// Graph
		System.out.println("Graph\n");
		Graph.graphDemo();
		printLine();
	}
 
	public static void main(String[] args) {
		demo();
	}
}
