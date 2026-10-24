public class A7_SwitchCase {
    public static void main(String[] args) {
        //traditional

        int day = 3;
        switch (day) {
            case 1 : System.out.println("Monday");
                        break;
            case 2 : {
                System.out.println("yes");
                System.out.println("nope");
                break;
            }
            default : System.out.println("nope");
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
    }
}
