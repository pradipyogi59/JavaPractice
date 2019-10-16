package OOP.Inheritance;


class Parent {
    String name = "Parent";

    public String getName() {
        return name;
    }
    protected void NotAccessMe(String s){
        System.out.println("Im private");
    }
}

class Child extends Parent {
    String name = "Child";

    public String getNameChild() {
        return name;
    }

}




public class Inheritance2 {

    public static void main(String args[]){

        // Parent p=new Child();
        //p.getName();
        //Above is valid
        //but below is invalid
        //p.getNameChild();

        // Child c=new Child();
        // String parentName=c.name; its give Child
        // System.out.println(parentName);
        // c.getNameChild();
        // c.getName();

        //we cant access private method of parent class
        //c.NotAccessMe();


        //Parent p=new Child();
        //System.out.println(p.name); its give Parent    bcoz of PArent class reference
        //System.out.println(p.getName());  we can access public method of parent class.
        //p.NotAccessMe(); we can;t call private method using child reference.
        //p.geNameChild(); not possible

        //with PArent class reference we only call parent specific method

        //Child c=new Parent();
//we can't use child ref. to hold parent class object

        //Every class in java is child class of object class
        //if our class is extends any other class then our class is not directly child class of object class.
        //Cyclic inheritance is not allowed in java A extends B , B extends A

    }



    /*
    Is-a relationship
    using extends keyword
    main advantage is reusability of code



     */

}

