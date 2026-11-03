package oops.thisKeyword;

class SmartBulb {
    private boolean isOn = false;
    private int brightness = 0;

    public void turnOn() {
        System.out.println("Powering up the bulb...");
        this.isOn = true;
        
        // Explicitly invoking another method inside this exact same class
        this.calibrateBrightness(); 
    }

    public void calibrateBrightness() {
        this.brightness = 100;
        System.out.println("Brightness optimized to " + this.brightness + "%");
    }

    public static void main(String[] args) {
        SmartBulb livingRoomLight = new SmartBulb();
        livingRoomLight.turnOn();
    }
}
// Its options btw, you can just write the method name and java handle it for you