import java.util.LinkedList;

public class LinekedList {
    static void main(String[] args) {

//        implementaion of linked list
        LinkedList<String> linkedList = new LinkedList<String>();

        //linked list as a stack
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.push("D");
//        linkedList.push("E");
//        System.out.println(linkedList);
//        linkedList.pop();
//        System.out.println(linkedList);

        //Linked list as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        System.out.println(linkedList);
//        linkedList.poll();

        linkedList.remove("E"); //Remove specific element
        linkedList.add(3,"L");//add element to specific index

        System.out.println(linkedList.indexOf("B")); //Getting index of specific element

        System.out.println(linkedList.peekFirst()); //get first element
        System.out.println(linkedList.peekLast()); // get last element

        linkedList.addFirst("0"); //adding element to the first
        linkedList.addLast("Z"); //adding element to the last
        System.out.println(linkedList);

        linkedList.removeFirst(); //remove first element
        linkedList.removeLast(); //remove last element
        System.out.println(linkedList);
    }
}
