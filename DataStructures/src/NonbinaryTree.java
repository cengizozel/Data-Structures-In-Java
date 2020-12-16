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
	
	public void createNBinaryTree() {
		NBTreeNode first = new NBTreeNode(5, null, null);
		NBTreeNode second = new NBTreeNode(4, null, null);
		NBTreeNode third = new NBTreeNode(3, first, second);
		NBTreeNode fourth = new NBTreeNode(2, null, third);
		NBTreeNode fifth = new NBTreeNode(1, fourth, null);
		
		root = fourth;
				
		while(root!=null) {
			System.out.println(root.data);
			root = root.sibling;
		}
	}
	
	
}
