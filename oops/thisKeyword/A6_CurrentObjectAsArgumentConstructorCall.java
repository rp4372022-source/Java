package oops.thisKeyword;

// 1. The Child Class (Engine)
class Engine {
    private Car parentCar; // A reference back to the car it belongs to

    // The constructor forces you to pass a Car object to create an Engine
    public Engine(Car parentCar) {
        this.parentCar = parentCar; // Storing the parent car reference
    }

    public void start() {
        System.out.println("Engine VROOM!");
        // The engine can now reach back out and toggle things on the parent car!
        parentCar.turnOnDashboardLights(); 
    }
}

// 2. The Parent Class (Car)
class Car {
    private Engine engine;

    public void buildCar() {
        System.out.println("Assembling the vehicle...");
        
        // Pass 'this' specific Car instance directly into the new Engine's constructor
        this.engine = new Engine(this); 
    }

    public void startCar() {
        if (engine != null) {
            engine.start();
        }
    }

    public void turnOnDashboardLights() {
        System.out.println("Dashboard is lit up and glowing green!");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.buildCar();  // Creates the engine and establishes the two-way connection
        myCar.startCar();  // Starts the engine, which triggers the dashboard lights
    }
}
