public class BinaryTree {
	
	// Binary so always two branches - left and right with their data
	class BTreeNode {
		BTreeNode left;
		BTreeNode right;
		int data;
		
		// You can define the data for the branch (which can have its own branches too)
		public BTreeNode(int data) {
			this.data = data;
		}
	}
	
	// Initiate it with root node.
	BTreeNode root;
	
	public void createBinaryTree() {
		BTreeNode first = new BTreeNode(1);
		BTreeNode second = new BTreeNode(2);
		BTreeNode third = new BTreeNode(3);
		BTreeNode fourth = new BTreeNode(4);
		BTreeNode fifth = new BTreeNode(5);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
	}
	
	// Various order methods using recursive programming
	
	public void preOrder(BTreeNode root) {
		if(root == null) {
			return;
		}
		else {
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public void inOrder(BTreeNode root) {
		if(root == null) {
			return;
		}
		else {
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	public void postOrder(BTreeNode root) {
		if(root == null) {
			return;
		}
		else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}	
	
	void levelOrder(BTreeNode root)
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++) {
            printGivenLevel(root, i);
        }
    }
 
	// Height of the tree. Length from root node to lowest leave node.
    int height(BTreeNode root)
    {
        if (root == null)
           return 0;
        else {
            // Compute  height of each subtree
        	// The method for counting: Once false is return, it keeps incrementing until we get back to the root
            int lheight = height(root.left); 
            int rheight = height(root.right);
             
            // Takes the larger one
            if (lheight > rheight) {
                return(lheight+1);
            }
            else {
            	return(rheight+1); 
            }
        }
    }
    
    void printGivenLevel (BTreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        }
        else if (level > 1) {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
    
    public static void btDemo() {
		BinaryTree bt = new BinaryTree();
		
		System.out.println("Creating Binary Tree");
		bt.createBinaryTree();
		
		System.out.println("\nPrinting Binary Tree");
		System.out.println("    1");
		System.out.println("   / \\");
		System.out.println("  2   3");
		System.out.println(" / \\");
		System.out.println("4   5");

		System.out.println("\nPreorder");
		bt.preOrder(bt.root);
		System.out.println(" ");
		
		System.out.println("\nInorder");
		bt.inOrder(bt.root);
		System.out.println(" ");
		
		System.out.println("\nPostorder");
		bt.postOrder(bt.root);
		System.out.println(" ");
		
		System.out.println("\nLevel Order");
		bt.levelOrder(bt.root);
    }
}
