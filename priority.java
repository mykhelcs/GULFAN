import java.util.Arrays;
import java.util.PriorityQueue;

public class priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(3);
        pq.add(4);

        // Convert PriorityQueue to array
        Integer[] arr = pq.toArray(new Integer[0]);

        // Print the array
        System.out.println("PriorityQueue as array: " + Arrays.toString(arr));
    }
}