package OOP.Interface;

public class interfaceBasic {
    //If we don't know number of iteration in advance then best suitable loop is while loop
    //If we want to execute body statement at least one time then use do while loop


    //Abstract Method : we don;t know about implementation still we declare method with abstract modifier.
    //Child class are responsible to provide implementation
    //Here we define guideline to child class which describe the method those method to be compulsory implemented by child class.
    //For Abstract class creation of object not possible.

    //If class contain atleast on abstract method then compulsory that class should be declared as a abstract otherwise we get compile time error.
    //bcoz impl. id not complete hence we can't create object.

    //And if class does not contain any abstract method still we define class as a abstract


    //Interface :
    /**
     * Interface is 100%  pure abstract class
     * Every method in interface is abstract
     * Advantage is security bcoz we are not highlight imp.
     *
     * If class implements interface then it is compulsory to implement all method of ineterface otherwise declare class as abstract
     *
     * Interface method isdefault public abstract
     *
     * Interface provide varible for constant at req. level. its always public static final(Implemented class can access varible but can't change)
     *
     *
     * VIP : IF two interface contains a method with same name but different parameter then the implemented both method in class.and these method tread as a methodoverloading
     * and if two interface contain same name same argument and same return type then in class implement only one method.
     *
     * Two interfaces with same methods having same signature but different return types give you error
     *
     * in two interface decalre varible x=1 and in class use x varible then its confuse to use x from which interface in this casee use interfacename.varible name
     */


    /**
     * Interface vs Abstraction
     *
     * If we dont know any thing about impl. and just have req.  then we should go for interface
     * If we are talking about impl.  but not completely then we should go for abstraction
     * Every method in Interface is public abstract
     * In abstract we can take concrete method.
     * Private,static,final method not allowed in interface
     * We can use any modifier in java
     * Constructor not allowed in interface
     * Constructor allowsed in abstract class
     *
     * IF we can't creatre object of abstract class then what is use of constructor ??
     *Imagine that your abstract class has fields x and y, and that you always want them to be initialized in a certain way, no matter what actual concrete subclass is eventually created. So you create a constructor and initialize these fields.
     *
     * Now, if you have two different subclasses of your abstract class, when you instantiate them their constructors will be called, and then the parent constructor will be called and the fields will be initialized.
     *
     * If you don't do anything, the default constructor of the parent will be called. However, you can use the super keyword to invoke specific constructor on the parent class.
     *
     *
     * oops
     * hiding internal impl. details & just show set of service what they are offering is called abstraction
     * by using interface & abstract class we achieve abstraction.
     *
     *
     */

}
