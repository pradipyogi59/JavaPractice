package Collections.Set;

import netscape.security.UserTarget;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasic01 {
    public static void main(String[] args) {

        Set<String> s=new HashSet<>();
        //Underlying data structure for HashSet is hashtable.
        //As it implements the Set Interface, duplicate values are not allowed.
        //Objects that you insert in HashSet are not guaranteed to be inserted in same order. Objects are inserted based on their hash code.
        //NULL elements are allowed in HashSet.

        s.add("p");
        s.add("z");
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("a");

        System.out.println(s);

        Set<String> s2=new TreeSet<>(s);
        //Objects in a TreeSet are stored in a sorted and ascending order.
        //TreeSet implements the SortedSet interface so duplicate values are not allowed.
        //TreeSet does not allow to insert Heterogeneous objects. It will throw classCastException at Runtime if trying to add hetrogeneous objects.
        //TreeSet serves as an excellent choice for storing large amounts of sorted information which are supposed to be accessed quickly because of its faster access and retrieval time.
        //insertion of null into a TreeSet throws NullPointerException because while insertion of null, it gets compared to the existing elements and null cannot be compared to any value.
        //Secondly, if we are depending on default natural sorting order, compulsory the object should be homogeneous and comparable otherwise we will get RuntimeException:ClassCastException
        //Hetergeneouse ex : ts.add(new StringBuffer("A"));
        //http://prntscr.com/pkehv3


        System.out.println(s2);

    }
}
