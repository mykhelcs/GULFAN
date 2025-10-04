import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class common {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        Stack<Integer> secStack = new Stack<>();
        myStack.push(3);
        myStack.push(1);
        myStack.push(4);
        myStack.push(2);
        myStack.push(2);
        myStack.push(2);
        secStack.push(2);
        secStack.push(3);
        secStack.push(5);
        secStack.push(6);

        System.out.println("First stack: " + myStack);
        System.out.println("Second stack: " + secStack);

        Stack<Integer> common = new Stack<>();
        List<Integer> list = new ArrayList<>(myStack);
        List<Integer> alreadyAdded = new ArrayList<>();
        for (int num: list) {
            if (secStack.contains(num) && !alreadyAdded.contains(num)) {
                common.push(num);
                alreadyAdded.add(num);
            }
        }
        System.out.println("Common elements stack: " + common);

       
    }

    
}