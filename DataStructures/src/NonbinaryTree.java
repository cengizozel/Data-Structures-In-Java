public class NonbinaryTree {
	
	class NBTreeNode {
		NBTreeNode child;
		NBTreeNode sibling;
		int data;
		
		public NBTreeNode(int data, NBTreeNode child, NBTreeNode sibling) {
			this.data = data;
			this.child = child;
			this.sibling = sibling;
		}
	}
	
	NBTreeNode root;
	
	// Needs work
	/*
	public void printNBT() {
		while(root!=null) {
			System.out.println(root.data);
			root = root.sibling;
		}
	}
	*/
	
	public void createNBinaryTree() {
		NBTreeNode sixth = new NBTreeNode(6, null, null);
		NBTreeNode fifth = new NBTreeNode(5, null, sixth);
		NBTreeNode fourth = new NBTreeNode(4, null, null);
		NBTreeNode third = new NBTreeNode(3, null, fourth);
		NBTreeNode second = new NBTreeNode(2, fifth, third);
		NBTreeNode first = new NBTreeNode(1, second, null);

		
		root = first;
	}
	
	public static void nbtDemo() {
		NonbinaryTree nbt = new NonbinaryTree();
		
		System.out.println("Creating NonBinary Tree");
		nbt.createNBinaryTree();
		
		System.out.println("\nPrinting NonBinary Tree");
		//nbt.printNBT();
		System.out.println("    1");
		System.out.println("   /|\\");
		System.out.println("  2 3 4");
		System.out.println(" / \\");
		System.out.println("5   6");
		
		// Will add order methods soon
	}
}
