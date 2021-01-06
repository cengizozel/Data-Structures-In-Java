import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

// This class creates and demonstrates various data structures using Java's native functions.
// Even though, personal implementations give a better understanding and flexibility, 
// in many cases, it is convenient to use Java's native abilities.

// Data structures are: LinkedList, Stack, Queue

public class JavaDS {
	
	public static void linkedList() {
        System.out.println("- LinkedList");

		System.out.println("\nCreating LinkedList");
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		System.out.println("\nIs LinkedList empty: " + list.isEmpty());
		
		System.out.println("\nAdding 1");
		list.add(1);
		
		System.out.println("Adding 2");
        list.add(2);
        
		System.out.println("Adding 3");
        list.add(3);
        
		System.out.println("\nPrinting List");
        System.out.println(list);
        
		System.out.println("\nRemoving Last");
        list.removeLast();
        
		System.out.println("\nPrinting List");
        System.out.println(list);
        
		System.out.println("\nIs LinkedList empty: " + list.isEmpty());
	}
	
	public static void stacks() {
        System.out.println("\n- Stack");

        System.out.println("\nCreating Stack");
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("\nIs stack empty: " + stack.isEmpty());

        System.out.println("\nPushing 1");
        stack.add(1);

        System.out.println("Pushing 2");
        stack.add(2);

        System.out.println("Pushing 3");
        stack.add(3);
		
		System.out.println("\nPrinting Stack");
        System.out.println(stack);
		
        System.out.println("\nPopping");
        stack.pop();
        
		System.out.println("\nPrinting Stack");
        System.out.println(stack);
        
		System.out.println("\nIs stack empty: " + stack.isEmpty());	
	}
	
	public static void queues() {
		
        System.out.println("\n- Queue");

        System.out.println("\nCreating Queue");
		Queue<Integer> queue = new LinkedList<Integer>();
		
		System.out.println("\nIs queue empty: " + queue.isEmpty());

        System.out.println("\nEnqueueing 1");
        queue.add(1);

        System.out.println("Enqueueing 2");
        queue.add(2);

        System.out.println("Enqueueing 3");
        queue.add(3);
		
		System.out.println("\nPrinting Queue");
        System.out.println(queue);
		
        System.out.println("\nDequeueing");
        queue.remove();
        
		System.out.println("\nPrinting Queue");
        System.out.println(queue);
        
		System.out.println("\nIs queue empty: " + queue.isEmpty());	
	}
	
	public static void javaDS_Demo() {
		linkedList();
		stacks();
		queues();
	}
}
