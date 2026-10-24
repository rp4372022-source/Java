public class A8_LoopsAndIterations {
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


        // labled loops
        outerLoop :
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(i!= 0 && i == j){
                    break outerLoop;
                    //same for continue ig
                }
            }
        }
    }
}
