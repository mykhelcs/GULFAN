import java.util.LinkedList;
import java.util.Queue;

public class deleteAllInstances {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(2);
        myQueue.offer(4);
        myQueue.offer(2);

        System.out.println("Original queue: " + myQueue);

        int elementToRemove = 2;
        Queue<Integer> tempQueue = new LinkedList<>();

        // Remove all instances of elementToRemove
        for (int num : myQueue) {
            if (num != elementToRemove) {
                tempQueue.offer(num);
            }
        }

        myQueue = tempQueue;

        System.out.println("Queue after removing all " + elementToRemove + ": " + myQueue);
    }
}