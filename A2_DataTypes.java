// strongly typed language
public class A2_DataTypes {
    public static void main(String[] args) {

        //Primitive 
        // Group A Integer Numbers (Whole Numbers)
        byte userAge = 20; // -128 to 127
        short flightAltitude = 12_000; // -32,768 to 32,767
        int totalScore = 550320; // -2,147,483,648 to 2,147,483,647
        long worldPopulation = 8000000000L; //9×10¹⁸ to 9×10¹⁸

        //Group B: Floating-Point Numbers (Decimals)
        float targetDistance = 45.5f;
        double gasPricePerLiter = 1.64;
        //[Note]Currency: Never use float or double -> uses BigDecimal

        // Group C: Characters
        char accountStatus = 'A'; // 2 bytes

        // Group D: Truth Values
        boolean isAlive = true; // 1 bit

        System.out.println(userAge+" "+flightAltitude+" "+totalScore+" "+worldPopulation+" "+targetDistance+" "+gasPricePerLiter
            +" "+accountStatus+" "+isAlive
        );

        //reference
        // String
        String name = "Rutik";
        // array
        int[] array = {1,2,3,4,5};
        System.out.println(name+" "+array[0]);
        // object 
        class Student {String name, course; Student(String n,String c){name=n;course=c;}@Override public String toString(){return "{"+name+","+course+"}";}}
        Student student = new Student("Ajay","AIML");
        System.out.println(student);
    }
}
