import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class duplicate {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(3);
        myStack.push(1);
        myStack.push(4);
        myStack.push(2);
        myStack.push(2);
        myStack.push(2);

        System.out.println("Original stack: " + myStack);

        Stack<Integer> duplicate = duplicateStack(myStack);

        System.out.println("Removed Duplicate stack: " + duplicate);
    }

    
}