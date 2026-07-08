import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueqe {
    static void main(String[] args) {
        //defining the priority queue
        Queue<Double> priorityQueue = new PriorityQueue<Double>();  // we can reverse order using this Collections.reverseOrder()

        priorityQueue.offer(1.6); //adding data to the queue
        priorityQueue.offer(0.5);
        priorityQueue.offer(5.5);
        priorityQueue.offer(3.5);
        priorityQueue.offer(6.0);

        System.out.println(priorityQueue);
    }
}
