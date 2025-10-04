import java.util.Stack;

    public class invert {

        public static Stack<Integer> invert(Stack<Integer> stack) {
        Stack<Integer> inverted = new Stack<>();
        while (!stack.isEmpty()) {
            inverted.push(stack.pop());
        }
        return inverted;
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(3);
        myStack.push(1);
        myStack.push(4);
        myStack.push(2);

        System.out.println("Original stack: " + myStack);

        Stack<Integer> inverted = invert(myStack);

        System.out.println("Inverted stack: " + inverted);
    }

    }