import java.util.LinkedList;
import java.util.Queue;

public class Queue_theory {
     public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();


        // inserting elements at rear
        q.add(2);
        q.add(7);
        q.add(4);

        // get size of queue
        System.out.println(q.size());

	// check if queue is empty
        if (q.isEmpty())
            System.out.println("Queue is empty");
        else
            System.out.println("Queue is not empty");

	 // get rear element (last enqueued)
        System.out.println(((LinkedList<Integer>) q).getLast());
    	 // getting the front element
        System.out.println(q.peek());
	
	 // deleting element from front
        q.poll();
	    q.remove();
    }
}


// Queue:

// it is used to store and managing the data in a specific order.
// it follow the principle of fifo, where the first element added to the queue is the first one to be removed.

// IMAGE:https://media.geeksforgeeks.org/wp-content/uploads/20250827110558739481/Dequeue-Operation-in-Queue-1.webp

// TYPE OF QUEUE:
// https://media.geeksforgeeks.org/wp-content/uploads/20250917154046246598/Types-of-Queue.webp

// 1. Simple Queue:

// A simple queue follows the FIFO (First In, First Out) principle.
// Insertion is allowed only at the rear (back).
// Deletion is allowed only from the front.
// Can be implemented using a linked list or a circular array.

// 2. Double-Ended Queue (Deque)
// In a deque, insertion and deletion can be performed from both ends.

// 3. Priority Queue
// A queue where each element is assigned a priority, and deletion always happens based on priority (not just position).


// Queue Operations
// Enqueue: Adds an element to the end (rear) of the queue. If the queue is full, an overflow error occurs.
// Dequeue: Removes the element from the front of the queue. If the queue is empty, an underflow error occurs.
// Peek/Front: Returns the element at the front without removing it.
// Size: Returns the number of elements in the queue.
// isEmpty: Returns true if the queue is empty, otherwise false.
// isFull: Returns true if the queue is full, otherwise false.
