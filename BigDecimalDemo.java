/*
BigDecimal is a Java class (in java.math) that stores exact
 decimal numbers without floating-point rounding bugs.
*/
import java.math.BigDecimal;

public class BigDecimalDemo{
    public static void main(String[] args) {
        
        BigDecimal a = new BigDecimal("10.25");
        BigDecimal b = new BigDecimal("9.44");

        BigDecimal c = a.add(b);

        System.out.println(c);

        BigDecimal d = BigDecimal.valueOf(10.12); //also fine

        // have many inbuilt methods explore later

    }
}