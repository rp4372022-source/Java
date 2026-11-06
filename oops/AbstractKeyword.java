package oops;

abstract class Animal{

    public abstract void makeSound();

    public static void sleep(){System.out.println("sleeping");}
}

class Cat extends Animal{

    public void makeSound(){
        System.out.println("cat : meow");
    }
}
public class AbstractKeyword {
    public static void main(String[] args) {
        Animal lucy = new Cat();
        lucy.makeSound();
    }
}

/*The abstract keyword in Java is a non-access modifier used to 
achieve abstraction, which means hiding the implementation details 
and showing only the essential features to the user. It can be 
applied to both classes and methods. */