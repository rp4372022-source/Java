package oops;

// Parent Class
class Vehicle {
    protected String brand = "Ford"; // Accessible by subclasses
    
    public void honk() {
        System.out.println("Beep, beep!");
    }
}

// Child Class inheriting from Vehicle
class Car extends Vehicle {
    private String modelName = "Mustang"; // Car's specific attribute
    
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();
        
        // 1. Call the inherited method from the Vehicle class
        myCar.honk(); 
        
        // 2. Access the inherited attribute from the Vehicle class and own attribute
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}

/*
Inheritance in Java is a mechanism where one class acquires 
the properties (fields) and behaviors (methods) of another class.
*/
