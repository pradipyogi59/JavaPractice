package Collections.List.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasic01 {
    public static void main(String[] args) {

        //Linked List are linear data structures
        //The elements are linked using pointers and addresses
        //Each element is known as a node. Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays
        //disadvantages like the nodes cannot be accessed directly instead we need to start from the head and follow through the link to reach to a node we wish to access.
        //To store the elements in a linked list we use a doubly linked list which provides a linear data structure and also

        LinkedList<String> object = new LinkedList<String>();
        object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");
        System.out.println("Linked list : " + object);

        object.remove("B");
        object.remove(3);
        object.removeFirst();
        object.removeLast();
        System.out.println("Linked list after deletion: " + object);
        boolean status = object.contains("E");

        if(status)
            System.out.println("List contains the element 'E' ");
        else
            System.out.println("List doesn't contain the element 'E'");



        Iterator<String> it=object.descendingIterator();
        System.out.println(object);
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println(object.element());
        //retrive first element.



    }
}
