class Stack {
	private QueueReferenceBased q1;
	private QueueReferenceBased q2;

	/** Initialize your Stack. */
	public Stack() {
		q1 = new QueueReferenceBased();
		q2 = new QueueReferenceBased();
	}

	/** Push element x onto stack. */
	public void push(Object x) {
		q2.enqueue(x);
		while (!q1.isEmpty()) {
			q2.enqueue(q1.peek());
			q1.dequeue();
		}
		q1 = q2;
		q2 = new QueueReferenceBased();
		System.out.println(q1.peek());
	}

	/** Pop the latest added element out of the stack. */
	public Object pop() {
		return q1.dequeue();
	}

	/** Check if the stack is empty. */
	public boolean isEmpty() {
		if (q1.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	/** Print out the queue and clear it.
	 *  Preconditions: none
	 *  Postconditions: print out every item in the queue and clears it.
	 */
	public void printQNC() {
		while (!q1.isEmpty()) {
			System.out.print(q1.peek());
			q1.dequeue();
		}
	}

}
