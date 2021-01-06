public class Main {
	
	public static void printLine() {
		System.out.println("\n////////////////////////////////////\n");
	}
	
	public static void demo() {
		
		System.out.println("DATA STRUCTURES IN JAVA");
		System.out.println("=======================\n");
		
		// Java native data structures (LinkedList, Stack, Queue)
		System.out.println("Java Native Data Structures");
		System.out.println("---------------------------\n");
		JavaDS.javaDS_Demo();
		printLine();
		
		// Linked Lists
		System.out.println("LinkedList Implementation");
		System.out.println("-------------------------\n");
		LinkedList.linkedListImpDemo();
		printLine();
		
		// Stacks
		System.out.println("Stack Implementation");
		System.out.println("--------------------\n");
		Stack.stackImpDemo();
		printLine();

		// Queues
		System.out.println("Queue Implementation");
		System.out.println("--------------------\n");
		Queue.queueImpDemo();
		printLine();
		
		// Binary Tree
		System.out.println("Binary Tree Implementation");
		System.out.println("--------------------------\n");
		BinaryTree.btDemo();
		printLine();
		
		// NonBinary Tree
		System.out.println("NonBinary Tree Implementation");
		System.out.println("-----------------------------\n");
		NonbinaryTree.nbtDemo();
		printLine();
		
		// Hash Table
		System.out.println("Hash Table");
		System.out.println("----------\n");
		HashTable.hashtableDemo();
		printLine();
		
		// Graph
		System.out.println("Graph using LinkedLists");
		System.out.println("-----------------------\n");
		Graph1.graphDemo();
		printLine();
	}
 
	public static void main(String[] args) {
		demo();
	}
}
