package threads;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        Runnable obj = new A1(); // yes we can do that 
        //Runnable is Functional Interface so we can do that 

        obj.run();


        Runnable obj1 = new Runnable(){ //using anonymus class
            public void run() {System.out.println("anonymus class output");}
        };
        obj1.run();

        Handler handler = new Handler();

        Runnable obj2 = () -> {
            handler.run();
        };

        Thread t1 = new Thread(obj2);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();


        System.out.println(Handler.counter); //output is not 20_000 cuz threads started and method also going forwarding
        //basically it do not count thread finishing until we mention it

        t1.join();
        t2.join();

        System.out.println(Handler.counter); // its better but not 20_000 cuz of race condition
        //(fixed using synchronised keyword)
    }
}

class A1 implements Runnable{ //we can implements Runnable to keep space to extend another class
    public void run() { System.out.println("running");}
}

class Handler implements Runnable{
    static int counter = 0;
    public synchronized void run() {
        for(int i=0;i<10_000;i++) {counter++;}
    }  
}


