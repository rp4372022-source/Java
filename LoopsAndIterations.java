public class LoopsAndIterations {
    public static void main(String[] args) {
        // while loop
        var isAlive = true;
        var work = 0;
        var age = 20;
        while(isAlive && age <= 58){
            work++;
            age++;
        }
        work--;     
        System.out.println(work);

        //for loop
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

        //break and continue
        // break -> to stop the loop
        // to continue the loop
    }
}
