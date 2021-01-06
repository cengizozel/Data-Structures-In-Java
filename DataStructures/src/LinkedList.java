public class LinkedList {
	
	Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if (index==0) {
			insertAtStart(data);
		}
		else {
			Node n = head;
			for (int i=0; i<index-1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;
		}
	}
	
	public void deleteAt(int index) {
		if (index==0) {
			head = head.next;
		}
		else {
			Node n = head;
			for (int i=0; i<index-1; i++) {
				n = n.next;
			}
			System.out.println("Deleting: " + n.next.data + " from index " + String.valueOf(index));
			n.next = n.next.next;
		}
	}
	
	public void show() {
		Node node = head;
		
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data + "\n");
	}
	
	public static void linkedListImpDemo() {
		
		System.out.println("Creating LinkedList");
		LinkedList list = new LinkedList();
		
		//System.out.println("\nIs LinkedList empty: " + list.isEmpty());
		
		System.out.println("\nAdding 1");
		list.insert(1);
		
		System.out.println("Adding 2");
        list.insert(2);
        
		System.out.println("Adding 3");
        list.insert(3);
        
		System.out.println("\nPrinting List");
		list.show();
		
		System.out.println("Removing Last");
		list.deleteAt(2);
        
		System.out.println("\nPrinting List");
		list.show();
		
		//System.out.println("\nIs LinkedList empty: " + list.isEmpty());
	}
}
