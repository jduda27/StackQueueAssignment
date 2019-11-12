/** Stack Implemented With Queues - Assignment 4
 *  Implement a stack using the textbook Queue implementations
 *  @author Joshua Duda
 *  @date 11/11/2019
 */

public class QueueTest {

	public static void main(String[] args) {
		
		//create a new stack
		Stack myStack = new Stack();
		//test if the stack is empty
		System.out.println("It is " + myStack.isEmpty() + " that this stack is empty");
		myStack.push(1);
		myStack.push(2);
		myStack.pop();
		myStack.push(3);
		//test if the stack is empty
		System.out.println("It is " + myStack.isEmpty() + " that this stack is empty");
		myStack.push(4);
		myStack.pop();
		myStack.push(4);

		//print the results and clear the stack.
		myStack.printQNC();
	}
}
