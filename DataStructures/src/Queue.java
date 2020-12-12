public class Queue {
	 
	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		queue[rear] = data;
		rear++;
		size++;
	}
	
	public int deQueue() {
		int data = queue[front];
		front++;
		size--;
		return data;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void show() {
		for (int i=0; i<size; i++) {
			System.out.print(queue[front+i] + " ");
		}
		System.out.println(" ");
	}
}
