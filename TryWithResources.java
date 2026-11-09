import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {
        
        // legacy code
        Scanner sc1 = null;
        try{
            sc1 = new Scanner(System.in);
        } finally{
            sc1.close();
        }
        
        // modern way
        try (Scanner sc2 = new Scanner(System.in))
        {
            System.out.print("Enter you name");
            String name = sc2.nextLine();
            System.out.println("Hello "+name);
        }
    }
}
