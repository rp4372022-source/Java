//1. Static Variables (Class Variables)
class Counter {
    static int count = 0; // Shared among all instances

    Counter() {
        count++; // Increments the same global variable every time a new object is created
    }
}

//2. Static Methods
class Utility {
    static int add(int a, int b) {
        return a + b;
    }
}

// 3. Static Blocks
class DatabaseConfig {
    static String dbUrl;

    static {
        dbUrl = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static block executed: DB URL initialized.");
    }
}

// 4. Static Nested Classes
class Outer {
    static int outerStaticField = 10;

    static class Inner {
        void display() {
            System.out.println("Accessing outer static: " + outerStaticField);
        }
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        int sum = Utility.add(5, 10); // No 'new Utility()' needed!
        Outer.Inner nestedObj = new Outer.Inner(); // Doesn't require an instance of Outer
    }
}
