import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

// This class creates and demonstrates various data structures using Java's native functions.
// Even though, personal implementations give a better understanding and flexibility, 
// in many cases, it is convenient to use Java's native abilities.

// Data structures are: LinkedList, Stack, Queue

public class JavaDS {
	
	public static void linkedList() {
		LinkedList<String> ll = new LinkedList<String>();
		
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
 
        System.out.println(ll);
 
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);
	}
	
	public static void stacks() {
		Stack<String> games = new Stack<String>();
		
		games.add("cod");
		games.add("minecraft");
		games.add("doom");
		
		games.pop();
		
		System.out.println(games);
	}
	
	public static void queues() {
		Queue<String> games2 = new LinkedList<String>();
		
		games2.add("cod");
		games2.add("minecraft");
		games2.add("doom");
		
		games2.poll();
	
		System.out.println(games2);
		
	}
	
	public static void javaDS_Demo() {
		linkedList();
		stacks();
		queues();
	}

}
