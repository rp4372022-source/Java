public class A7_SwitchCase {
    public static void main(String[] args) {
        //traditional

        int day = 3;
        switch (day) {
            case 1 : 
                System.out.println("Monday");
                break;
            case 2 : {
                System.out.println("yes");
                System.out.println("nope");
                break;
            }
            default : 
                System.out.println("nope");
                break;
        }

        // using arrows
        int hardWork = 100;
        long reward = switch(hardWork){
            case 0 -> 0;
            case 10 -> hardWork*10;
            case 60 -> hardWork*600;
            case 100 -> hardWork * 999999999999999l;
            default -> hardWork;
        };
        System.out.println(reward);


        //yield keyword
        
        int a = 10, b = 10, c = -10;
        int result = switch (c) {
            case -10 -> {
                System.out.println("Calculating negative case...");
                int temp = a + b;
                yield temp; // Explicitly tells Java: "This is the final value for this case"
            }
            default -> 0;
        };

        System.out.println(result);

        //for cases where same value on diff cases needed

        int dayy = 1;
        switch (dayy) {
            case 1 : case 10 : case 50 :
                System.out.println("Day good");
                break;
            case 2 : case 20 :
                System.out.println("Day even good");  
                break; 
            default:
                System.out.println("ok");
        }

        int dayyy = 3;
        switch (dayyy) {
            case 1, 10, 30 -> System.out.println("Day good");
            case 2, 20 -> System.out.println("Day even good");
            default -> System.out.println("ok");
        }
        
    }
}
