public class QueueTest {

	public static void main(String[] args) {

    Stack myStack = new Stack();
    System.out.println("It is "+myStack.isEmpty()+" that this stack is empty");
	myStack.push(1);
    myStack.push(2);
    myStack.pop();
    myStack.push(3);
	System.out.println("It is "+myStack.isEmpty()+" that this stack is empty");
	myStack.push(4);
	myStack.pop();
	myStack.push(4);

	myStack.printQNC();
  }
}
