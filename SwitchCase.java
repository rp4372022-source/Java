public class SwitchCase {
    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> {
                System.out.println("yes");
                System.out.println("nope");
            }
            default -> System.out.println("nope");
        }
    }
}
