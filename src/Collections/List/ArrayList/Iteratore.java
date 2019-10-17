package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteratore {
    public static void main(String[] args) {

        //ListIterator
        //It is only applicable for List collection implemented classes like arraylist, linkedlist etc. It provides bi-directional iteration. ListIterator must be used when we want to enumerate elements of List. This cursor has more functionality(methods) than iterator.

        //Differences between Iterator and ListIterator:
        //Iterator can traverse only in forward direction whereas ListIterator traverses both in forward and backward directions.
        ArrayList<Integer> list
                = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Iterator
        Iterator itr = list.iterator();

        System.out.println("Iterator:");
        System.out.println("Forward traversal: ");

        while (itr.hasNext())
            System.out.print(itr.next() + " ");

        System.out.println();


        // ListIterator
        ListIterator i = list.listIterator();


        System.out.println("ListIterator:");
        System.out.println("Forward Traversal : ");

        while (i.hasNext())
            System.out.print(i.next() + " ");

        System.out.println();

        System.out.println("Backward Traversal : ");

        while (i.hasPrevious())
            System.out.print(i.previous() + " ");

        System.out.println();



    }
}
