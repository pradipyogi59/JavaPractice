package Basic;

public class AccessModifier {


    //Public
    /* *
    IF we declare varible or method as a public then we can use it anywhere.but corresponding class should be public
    Before checking member visibility we need to check class visibility.
    clas a and public class b

    * */

    //Default
    /**
     * If member declared as a default the nwe can access that member only within current package. Its a package level access
     *
     */

    //Private
    /**
     * If memeber is private then we use it whithin class
     */

    //Protected
    /**
     * we can access member with in the package and outside package in child class
     * Protected = default + child
     */

    //MOst restricted modiefir : Private , Most accessible modifier : Public , private<default<protected<public
}
