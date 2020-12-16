public class Stack {
	
	Node head;
	
	public void push(int data) {
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
	
	public void pop() {
		Node n = head;
		while(n.next.next!=null) {
			n = n.next;
		}
		n.next = null;
	}
	
	
	public int peek() {
		Node n = head;
		
        if (head == null) {
        	System.out.printf("\nStack is empty.");
        }
        else {
        	while(n.next!=null) {
        		n = n.next;
        	}
        }
        return n.data;
	}
	
	
	public int size() {
		int top = 0;
		Node n = head;
		while(n.next!=null) {
			n = n.next;
			top++;
		}
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
