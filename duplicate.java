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

    public static Stack<Integer> duplicateStack(Stack<Integer> stack) {
        Stack<Integer> stackFinal = new Stack<>();
        List<Integer> list = new ArrayList<>(stack);
        List<Integer> finalList = new ArrayList<>();

        for (int num : list) {
            if (!finalList.contains(num)) {
                finalList.add(num);
            }
        }

        // Push elements in reverse order to preserve stack order
        for (int i = finalList.size() - 1; i >= 0; i--) {
            stackFinal.push(finalList.get(i));
        }
        return stackFinal;
    }
}