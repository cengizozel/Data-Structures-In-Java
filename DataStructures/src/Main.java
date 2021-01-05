public class Main {
 
	public static void main(String[] args) {
		
		/*
		// Linked Lists
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insertAtStart(0);
		list.insertAt(2, 15);
		list.insertAt(0, -1);
		list.show();
		
		list.deleteAt(2);
		list.show();
		*/
		
		/*
		// Stacks
		Stack stack = new Stack();
		System.out.println("Stack is empty: " + stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.show();
		System.out.println("Stack is empty: " + stack.isEmpty());
		
		stack.pop();
		stack.show();
		
		stack.push(4);
		stack.show();
		System.out.println("Peek is " + stack.peek());
		System.out.println("Size is " + stack.size());
		
		stack.push(5);
		stack.push(6);
		stack.push(10);
		stack.show();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.show();
		*/

		
		/*
		// Queues
		Queue queue = new Queue();
		System.out.println("Queue is empty: " + queue.isEmpty());
		
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.show();
		
		queue.deQueue();
		queue.show();
		System.out.println("Size: " + queue.size());
		System.out.println("Queue is empty: " + queue.isEmpty());
		*/
		
		/*
		// Binary Tree
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		bt.preOrder(bt.root);
		System.out.println(" ");
		bt.inOrder(bt.root);
		System.out.println(" ");
		bt.postOrder(bt.root);
		System.out.println(" ");
		bt.levelOrder(bt.root);
		*/
		
		/*
		// NonBinary Tree
		NonbinaryTree nbt = new NonbinaryTree();
		nbt.createNBinaryTree();
		*/
		
		/*
		// Hash Table
		HashTable theFunc = new HashTable(30);

		// Simplest Hash Function

		// String[] elementsToAdd = { "1", "5", "17", "21", "26" };

		// theFunc.hashFunction1(elementsToAdd, theFunc.theArray);

		// Mod Hash Function
		// This contains exactly 30 items to show how collisions
		// will work

		String[] elementsToAdd2 = { "100", "510", "170", "214", "268", "398",
				"235", "802", "900", "723", "699", "1", "16", "999", "890",
				"725", "998", "978", "988", "990", "989", "984", "320", "321",
				"400", "415", "450", "50", "660", "624" };

		theFunc.hashFunction2(elementsToAdd2, theFunc.theArray);

		// Locate the value 660 in the Hash Table

		theFunc.findKey("660");

		theFunc.displayTheStack();
		*/
		
		// JavaDS.javaDS_Demo();
		
		Graph.demo();
		
	}
}
