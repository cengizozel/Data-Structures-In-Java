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
	
	public static void stackImpDemo() {

        System.out.println("Creating Stack");
		Stack stack = new Stack();
		
		System.out.println("\nIs stack empty: " + stack.isEmpty());

        System.out.println("\nPushing 1");
        stack.push(1);

        System.out.println("Pushing 2");
        stack.push(2);

        System.out.println("Pushing 3");
        stack.push(3);
		
		System.out.println("\nPrinting Stack");
		stack.show();
		
        System.out.println("\nPopping");
        stack.pop();
        
		System.out.println("\nPrinting Stack");
		stack.show();
        
		System.out.println("\nIs stack empty: " + stack.isEmpty());
	}
}
