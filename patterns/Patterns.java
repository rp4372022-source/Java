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
    }
}
