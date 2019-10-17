package Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteratore2 {
    public static void main(String[] args) {

        //ListIterator can help to replace an element whereas Iterator cannot.
        ArrayList<Integer> aList
                = new ArrayList<Integer>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);


        ListIterator<Integer> it=aList.listIterator();

        while (it.hasNext())
        {
            int a=it.next();
            if (a==4)
            it.set(400);

            System.out.println(a);
        }
        System.out.println(aList);



        //ITERATOR
        //1.Can traverse elements present in Collection only in the forward direction.
        //2.Helps to traverse Map, List and Set.
        //3.Indexes cannot be obtained by using Iterator.
        //4.Cannot modify or replace elements present in Collection
        //5.Cannot add elements and it throws ConcurrentModificationException.
        //6.Certain methods of Iterator are next(), remove() and hasNext().

        //LISTITERATOR
        //Can traverse elements present in Collection both in forward and backward directions.
        //Can only traverse List and not the other two.
        //It has methods like nextIndex() and previousIndex() to obtain indexes of elements at any time while traversing List.
        //We can modify or replace elements with the help of set(E e)
        //Can easily add elements to a collection at any time.
        //Certain methods of ListIterator are next(), previous(), hasNext(), hasPrevious(), add(E e).


    }
}
