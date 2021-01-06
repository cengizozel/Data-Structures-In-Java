import java.util.LinkedList;

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
	
	public static void queueImpDemo() {
		
        System.out.println("Creating Queue");
		Queue queue = new Queue();
		
		System.out.println("\nIs queue empty: " + queue.isEmpty());

        System.out.println("\nEnqueueing 1");
        queue.enQueue(1);

        System.out.println("Enqueueing 2");
        queue.enQueue(2);

        System.out.println("Enqueueing 3");
        queue.enQueue(3);
		
		System.out.println("\nPrinting Queue");
		queue.show();
		
        System.out.println("\nDequeueing");
        queue.deQueue();
        
		System.out.println("\nPrinting Queue");
		queue.show();
        
		System.out.println("\nIs queue empty: " + queue.isEmpty());
	}
}
