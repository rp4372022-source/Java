
// Specifier	Data Type	Example Output
// %d or %i	Signed integer	42, -10
// %u	Unsigned integer	42
// %f	Floating-point number (decimal)	3.141593
// %.2f	Floating-point limited to 2 decimal places	3.14
// %c	Single character	A
// %s	String of characters	Hello
// %x / %X	Hexadecimal number (lower/uppercase)	1a or 1A


public class A5_printfFormatting {
    public static void main(String[] args) {
        String name = "Rutik", 
        dream = "SDE";
        float height = 99.9999f;
        System.out.printf("I am %s, want to become %s, currently at height of %.2f feet",name,dream,height);
    }
}