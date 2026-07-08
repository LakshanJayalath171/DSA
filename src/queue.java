import java.util.LinkedList;
import java.util.Queue;

public class queue {
    static void main(String[] args) {
        Queue<String> queue01 = new LinkedList<String>();

        queue01.offer("RDR 2");      //add a element to the queue using offer()
        queue01.offer("COD MW 2019");
        queue01.offer("Battlefeild 6");
        queue01.offer("God of War 2018");
        queue01.offer("GTA 6");

        System.out.println(queue01);
        System.out.println(queue01.peek()); // peek() returns the top element without removing it

        System.out.println(queue01.isEmpty()); // check queue is empty

        System.out.println(queue01.contains("RDR 2")); //check the specify element in the queue

        System.out.println(queue01.size()); // returns the count of element in the queue

        queue01.poll(); //remove the top element
        System.out.println(queue01);
    }
}
