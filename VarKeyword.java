public class VarKeyword {
    public static void main(String[] args) {
        var accountBalance = 2500.50; // Java looks at 2500.50 and automatically treats this as a 'double'
        var modernGreeting = "Hello"; // Java looks at the double quotes and treats this as a 'String'
        System.out.println(accountBalance + " "+ modernGreeting);

        // Fixed Typing: Once Java infers the type, it is locked in forever. 
        // If var age = 30; runs, Java locks it as an int. You cannot write age = "Thirty"; on the next line.
        // Immediate Initialization: You cannot declare a blank var. 
        // Code like var totalAmount; will fail to compile because Java has no right-side value to inspect, 
        // meaning it cannot figure out what memory size to reserve.
        // Local Scope Only: You can only use var inside local methods (the code blocks where actions happen). 
        // You cannot use var when defining fields directly inside a Class blueprint.
    }
}
