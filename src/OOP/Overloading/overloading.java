package OOP.Overloading;


class Wfa{

    public void amount(String amount){
        System.out.println("Amount String is :"+amount);
    }

    public void amount(int amount){
        System.out.println("Amount Int is :"+amount);
    }




}

public class overloading {

    public static void main(String args[]){

        Wfa w=new Wfa();
        w.amount(10);
        //In overloading method resolution always take care by compiler based on reference type.
        //Also knows as compile type polymorphism
        //Static polymorphism
        //early Binding
        //Here reference type is very imp. & runtime object is dummy.
        //return type is not problem in method overloading


        //Two method having same name with different parameter (arguments) called method overloading

    }
}