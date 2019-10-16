package OOP.Overriding;

class a{

    protected void sum(){

    }
}
class b extends a{

    public void sum(){

    }
}



public class overriding {



    //it is also known as Runtime polymorphism or late binding or dynamic polymorphism

    //Rules : method name and arguments must be matched and return type must be matched
    //Private method we can't use in child class so overriddent concept not applicable for private method.
    //For parent class abstract method we overrride in child class to provide impl.

    //we can't decrease scope of modifier in Parent class protected and in child class public allowed

    //we can't override a static method as non static
    //Parent class : static void sin(int i) Child class : void sin(int i) vice versa non static to static no overridden

    //If both method are static then we can override but its not override its is Method Hiding.
    //Method hiding is compile time polymorphism or static pol. or early binding (same as overloading)

    //Overrding concept not applicable for varivble. is always take care
}
