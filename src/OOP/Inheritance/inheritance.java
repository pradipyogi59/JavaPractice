package OOP.Inheritance;

//---------------------------------------
//--- STEP 00 - WHAT IS INHERITANCE?
//---------------------------------------

///**
// * Inheritance = is-a relationship between a superclass and its subclasses.
// *
// * For example, Dog (subclass) is-a of type Animal (superclass). So Dog can inherit (reuse) members of Animal class;
// * plus it can have its own new behavior and properties.
// */

//---------------------------------------
//--- STEP 01 - UNDERSTAND INHERITANCE BY EXAMPLE
//---------------------------------------

/**
 * Test class for inheritance behavior - Dog class is inheriting behavior and properties of Animal class and can have its own too.
 *
 *
 */
public class inheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setId(123); // inherited from super class
        dog.sound(); // overrided behavior of sub class
        dog.eat("banana");
    }
}

/**
 * This is parent (also called as super or base) class Animal
 *
 * @author tirthalp
 *
 */
class Animal {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sound() {
        System.out.println("By default it is mute");
    }

    public void eat(String a, String b) {
        System.out.println("Eating :" + a + " And :" + b);
    }

    public void eat(String b) {
        System.out.println("Eating :" + b);
    }
}

/**
 * This is subclass (also called as derived or child or extended) Dog which is extending Animal
 *
 * @author tirthalp
 *
 */
class Dog extends Animal {

    // Own behavior
    private void bark() {
        System.out.println("Dog '" + getId() + "' is barking");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}