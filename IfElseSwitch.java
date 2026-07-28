public class IfElseSwitch {
    public static void main(String[] args) {
        int age = 20;
        if(age >= 18){
            System.out.println("You are a responsible man now");
        } else {
            System.out.println("Enjoy life");
        }

        boolean isAlive = true;
        boolean isWorking = false;
        if(isAlive && isWorking){System.out.println("Excellent");}
        else if(isAlive && !isWorking) System.out.println("You should try");
        else System.out.println("idk man");
    }
}
