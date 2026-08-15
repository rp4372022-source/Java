//exception is an event which disrupts the program flow

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileReader;

public class ExceptionHandlingDemo {
    public static void main(String[] args) throws IOException {//bad practice but okay for now 
        class ExceptionPract {
            void test(){
                try{
                    //risky code
                    int a = 9;
                    int b = 0;
                    int res = a/b;
                    System.out.println(res);
                } catch (ArithmeticException e) {
                    //handling exceptions
                    System.out.println("Division by zero error: " + e.getMessage());
                } 
                finally{
                    //executes no matter what
                    System.out.println("Reached in finally block");
                }
            }
            //throw vs throws
            // throw
            static void checkAge(int age) {
                if (age < 18) {
                    throw new IllegalArgumentException("Age must be 18 or above");
                }
            }
            // throws
            void readFile(String path) throws IOException {
                if(path == null) throw new IllegalArgumentException("path cannot be null");
                FileReader fr = new FileReader(path);
                fr.close();
            }
            
        }

        class TryWithResourcesPract {
            void test(){
                try (Scanner sc = new Scanner(System.in)){
                    int a = sc.nextInt();
                    if( a == 0) throw new IllegalArgumentException("0 entered");
                } catch (IllegalArgumentException e){
                    System.out.println(e);
                } 
                catch (InputMismatchException e){
                    System.out.println("Invalid input: "+e.getMessage());
                } 
            }
        }

        TryWithResourcesPract twrp = new TryWithResourcesPract();
        

        /*Creating your own exceptions in Java is straightforward 
        define a new class that extends either Exception (for checked exceptions) 
        or RuntimeException (for unchecked exceptions).*/ 

        class InvalidUserInputException extends RuntimeException{
            public InvalidUserInputException(String message){
                super(message);
            }
        }
        class Test{
            void testing(){
                try{
                    int a = 0;
                    if(a == 0) throw new InvalidUserInputException("Current input not allowed");
                } catch (InvalidUserInputException e){
                    System.out.println(e); //for degugging 
                    System.out.println(e.getMessage());// for user friendly exception
                    e.printStackTrace(); //to get info of everyting
                }

            }
        }

        Test test = new Test();
        test.testing();

        
        // trash
        ExceptionPract exceptionPract = new ExceptionPract();
        exceptionPract.test();
        ExceptionPract.checkAge(18);
        // exceptionPract.readFile("C:\\Users\\patil\\OneDriveApology letter.pdf"); //incorrect path
        exceptionPract.readFile(null);

        twrp.test();
    }    
}
