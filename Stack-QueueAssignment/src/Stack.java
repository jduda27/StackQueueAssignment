/** Stack Implemented With Queues - Assignment 4
 *  Implement a stack using the textbook Queue implementations
 *  @author Joshua Duda
 *  @date 11/11/2019
 */

class Stack {
	private QueueReferenceBased q1;
	private QueueReferenceBased q2;

	/** Initialize your Stack. */
	public Stack() {
		q1 = new QueueReferenceBased();
		q2 = new QueueReferenceBased();
	}

	/**
	 * Push element x onto stack. Precondition: Object x that will be pushed to the
	 * front of the queue Postcondition: The updated stack with x at the top.
	 */
	public void push(Object x) {
		// add x to a temp queue
		q2.enqueue(x);
		while (!q1.isEmpty()) { // while the original queue is not empty
			q2.enqueue(q1.peek()); // add the value at the front of the queue behind q1
			q1.dequeue(); // remove the item from q1
		}
		q1 = q2; // set q1 to the temporary queue
		q2 = new QueueReferenceBased(); // reset q2 to be an empty queue
	}

	/**
	 * Pop the latest added element out of the stack. Precondition: none
	 * Postcondition: returns the stack with the top removed.
	 */
	public Object pop() {
		return q1.dequeue(); // remove the value in the front from the stack
	}

	/**
	 * isEmpty() Method Check if the stack is empty. Preconditions: none
	 * Postconditions: true if the stack is empty, false if the stack is not empty
	 */
	public boolean isEmpty() {
		if (q1.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Print out the queue and clear it. Preconditions: none Postconditions: print
	 * out every item in the queue and clears it.
	 */
	public void printQNC() {
		// check if the queue is empty
		while (!q1.isEmpty()) { // while not empty print the top of the stack
			System.out.print(q1.peek());
			q1.dequeue(); // dequeue the item from the top
		}
	}

}
