package Collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListBasic01 {
    public static void main(String[] args) {

        //ArrayList inherits AbstractList class and implements List interface.
        //ArrayList can not be used for primitive types, like int, char, etc
        //Constructors in Java ArrayList:
//        ArrayList(): This constructor is used to build an empty array list
//        ArrayList(Collection c): This constructor is used to build an array list initialized with the elements from collection c
//        ArrayList(int capacity): This constructor is used to build an array list with initial capacity being specified

        //The Java.util.List is a child interface of Collection
        // ordered collection of objects in which duplicate values can be stored. Since List preserves the insertion order, it allows positional access and insertion of elements. List Interface is implemented by ArrayList, LinkedList, Vector and Stack classes.
        //List a = new ArrayList();
        //List b = new LinkedList();
        //List c = new Vector();
        //List d = new Stack();


        // size of ArrayList
        int n = 5;

        //declaring ArrayList with initial size n
        ArrayList<Integer> arrli = new ArrayList<Integer>(n);

        // Appending the new element at the end of the list
        for (int i=1; i<=n; i++)
            arrli.add(i);

        // Printing elements
        System.out.println(arrli);

        // Remove element at index 3
        arrli.remove(3);

        // Displaying ArrayList after deletion
        System.out.println(arrli);

        // Printing elements one by one
        for (int i=0; i<arrli.size(); i++)
            System.out.print(arrli.get(i)+" ");

        //The forEach() method of ArrayList used to perform the certain operation for each element in ArrayList. This method traverses each element of the Iterable of ArrayList until all elements have been Processed by the method or an exception is raised.

        arrli.forEach(n1-> System.out.println(n1));

    }


}

