package oops;

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle1 myCar = new Car();
        myCar.start();
    }
}
//for some reason in vs code we need to put the public class first to load correctly
interface Vehicle1 {
    void start();
    void applyBrakes();
}
class Car implements Vehicle1 {
    @Override 
    public void start(){
        System.out.println("starting");
    }
    @Override 
    public void applyBrakes(){
        System.out.println("Braking");
    }
}

