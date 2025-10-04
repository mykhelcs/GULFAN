import java.util.LinkedList;
import java.util.Queue;

public class eliminate {

    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);

        
        System.out.println("Original queue: " + myQueue);

        // Remove (eliminate) the head of the queue
        Integer removed = myQueue.poll();

        System.out.println("Removed item: " + removed);
        System.out.println("Queue after removal: " + myQueue);
    }
}