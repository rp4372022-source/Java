public class StringDemo {
    public static void main(String[] args) {
        //String -> A sequence of characters
        //immutable
        String greeting = "Welcome back, User";
        // "greeting" holds a memory location address pointer.
        // The text "Welcome back, User" is stored over in the Heap memory.
        System.out.println(greeting);


        String s1 = "java";//stored in string pool constant
        String s2 = "java";//reused from string pool constant
        String s3 = new String("java");//stored in heap memory
        System.out.println(s1 == s2); //true
        System.out.println(s1 == s3);//false

        

        String name = "  Professional Java Devloper  ";
        
        name.length();//returns langth of string
        name.charAt(1);//return char at
        name.indexOf("Java");//return index of first occurance
        name.lastIndexOf("Devloper");//- - --- last occurance

        //stripped out the white spaces
        String strippedName = name.strip(); 
        
        // name.substring(1,2);
        System.out.println(name.substring(0,10));
        //check if ->
        //compares based on values
        boolean isMatch = strippedName.equals(name.strip());
        strippedName.equalsIgnoreCase(name.strip()); //case ignored
        // contains provided string 
        boolean hasDev = strippedName.contains("Devloper");
        //start and ends with
        strippedName.startsWith("Java");
        strippedName.endsWith("Devloper");

        //string is empty
        name.isEmpty(); //->string length is zero
        name.isBlank(); //->string is empty and contains blank spaces
        System.out.println("  ".isBlank()+" "+" ".isEmpty()); //true false
        //created arrays of words in string
        String[] words = strippedName.split(" ");
        
        //replace old characters with provoided ones
        String strucutralName = strippedName.replace(" ","_");
        

    
        //trash
        // System.out.println(isMatch);
        // System.out.println(hasDev);
        // System.out.println(words[0]);
        // System.out.println(strucutralName);
        // System.out.println("  ".isBlank()+" "+" ".isEmpty());
    }
}
