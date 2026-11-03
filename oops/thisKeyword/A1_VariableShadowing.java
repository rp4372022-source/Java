package oops.thisKeyword;

class Car{
    private String name;// field / instance variable
    
    //back then 
    void setName(String name,Car car){
        Car tempCar = car;
        tempCar.name = name;// A parameter is a local variable
    }
} 

// 1. Differentiating Fields from Parameters (Variable Shadowing)
class Truck{
    private String name;
    
    // this keyword
    void setName(String name){
        this.name = name;
    }
}

public class A1_VariableShadowing {
    
}
