package Collections.List.ArrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListBasic02 {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1);  // adds 1 at 0 index
        l1.add(1, 2);  // adds 2 at 1 index
        System.out.println(l1);  // [1, 2]

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        l1.addAll(l2);
        System.out.println(l1);

        // Using indexOf() and lastIndexOf()
        System.out.println("first index of Geeks:" +
                l1.indexOf(1));
        System.out.println("last index of Geeks:" +
                l1.lastIndexOf(1));

        List<Integer> range = new ArrayList<Integer>();
        // Return List between 2nd(including)
        // and 4th element(excluding)
        range = l1.subList(2, 4);
        System.out.println(range);


        //Synchronization of ArrayList in Java
        //arrayList is not synchronized is by default. It means if a thread modifies it structurally and multiple threads access it concurrently, it must be synchronized externally
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("practice");
        list.add("code");
        list.add("quiz");
        synchronized(list)
        {
            // must be in synchronized block
            Iterator it = list.iterator();

            while (it.hasNext())
                System.out.println(it.next());
        }

        //Another Way for thread safe
        CopyOnWriteArrayList<String> threadSafeList
                = new CopyOnWriteArrayList<String>();



    }
}
