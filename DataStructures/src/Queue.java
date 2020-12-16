public class Queue {
	 
	Node head;
	
	public void enQueue(int data) {
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
	
	public void deQueue() {
		Node n = head;
		head = n.next;
	}
	
	public int size() {
		int top = 0;
		Node n = head;
		while(n.next!=null) {
			n = n.next;
			top++;
		}
		top++;
		return top;
	}
	
	public boolean isEmpty() {
		return (head==null);
	}
	
	public void show() {
        if (head == null) {
        	System.out.printf("\nStack is empty.");
        } 
        else {
            Node temp = head;
            while (temp != null) {
                System.out.printf("%s ", temp.data);
                temp = temp.next;
            }
            System.out.println("");
        }
	}
}
