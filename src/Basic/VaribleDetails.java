package Basic;

public class VaribleDetails {
    //Primitive varible : int x=10;
    //Reference varible : Student s=new Student();

    //Instance varible,Local Varible,Static Varible

    //Instatnce Varible : If value of a varible is object to object such type of varible is called Instance varible.
    //For every object seperte copy of instance varible i created.
    //Scope is same as object. its created at time of objct created and destroyed at time object destroyed.
    //Its decalred within class,and outside method
    //For access instatnce varible in static area we need to create object of class and for instatnce area we can access directly.
    //It is not required to perform initialization,Jvm provide defauld Value
    //It is also known as Object level varible


    String s; //its instance varible
    static String web;
    //If value of varible is not varied from obj to obj then it is never recommended to decalre that varible to objectlevel.
    //We have to declare such type of varible to class level using static modifier.
    //Single copy shared to each object
    //Its created at time class craeted.
    //Its class level varible


    public static void main(String args[]){

    }

    public void method(){

        int x=10;
        //Temporary req. varible
        //sotre inside block
        //jvm not provide default value.
        //only applicable modifier is final

    }
}
