import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class queue {

    

    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);

        
        List<Integer> list = List.copyOf(myQueue);
        for(int num :list ){
            System.out.println(num);
        }


    }
}