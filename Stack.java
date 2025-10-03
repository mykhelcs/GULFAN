import java.util.Stack;

public class Stack {

    public static Stack<INTEGER> sortedStack(Stack<INTEGER> stack) {
        Stack<Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int current = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            tempStack.push(current);
        }
        return tempStack;
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(3);
        myStack.push(1);
        myStack.push(4);
        myStack.push(2);

        System.out.println("Original stack: " + myStack);

        Stack<Integer> sorted = sortedStack(myStack);

        System.out.println("Sorted stack: " + sorted);
    }
}
