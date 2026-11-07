package patterns;

public class Patterns {
    public static void main(String[] args) {
        
        int length = 5;
        /*square hollow pattern
        * * * * * 
        *       * 
        *       * 
        *       * 
        * * * * * 
        */
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(i == 0 || i == length-1 || j == 0 || j == length-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        /*Right Half pyramid
        * 
        * * 
        * * * 
        * * * * 
        * * * * * 
        */
        for(int i=0;i<length;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*Right Half pyramid
        * * * * * 
        * * * * 
        * * * 
        * * 
        * 
        */
        for(int i=length-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        /*Left Half pyramid
                * 
              * * 
            * * * 
          * * * * 
        * * * * * 
        */
        for(int i=0;i< length;i++){
            for(int j=length-1;j>=0;j--){
                if(j > i) System.out.print("  ");
                else System.out.print("* ");
            }

            System.out.println();
        }


        /*Reversed Left Half pyramid
        * * * * * 
          * * * * 
            * * * 
              * * 
                *
        */
        for(int i=0;i< length;i++){
            for(int j=0; j< length;j++){
                if(j < i) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }

        /*
           1 
          2 2 
         3 3 3 
        4 4 4 4 
        */
        length = 4;
        for(int i=0;i<length;i++){
            for(int j=0;j<length-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
}
