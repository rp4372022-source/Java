package oops;

class Computer {
    void start(){System.out.println("booting up");}

    class CPU {
        public void doTask(){
            System.out.println("Performing task");
        }
    }
}
public class InnerClasses {
    public static void main(String[] args) {
        Computer computer = new Computer();
    
        Computer.CPU cpu = computer.new CPU();
        cpu.doTask();
    }
}
