// strongly typed language

public class DataTypes {
    public static void main(String[] args) {
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
    }
}
