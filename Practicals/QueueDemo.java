package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(33); //adds
		queue.offer(44);
		queue.offer(55);
		System.out.println(queue);
		
		queue.poll(); //removes
		System.out.println(queue);
		
		System.out.println(queue.peek()); //gets
		
		queue.offer(66);
		System.out.println(queue);
		
	}

}
