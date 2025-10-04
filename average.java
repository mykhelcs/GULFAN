import java.util.LinkedList;
import java.util.Queue;

public class average {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);
        myQueue.offer(40);

        int sum = 0;
        int count = 0;

        for (int num : myQueue) {
            sum += num;
            count++;
        }

        double average = (count == 0) ? 0 : (double) sum / count;

        System.out.println("Queue: " + myQueue);
        System.out.println("Average: " + average);
    }
}