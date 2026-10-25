public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Rutik");
        str.append(" Patil");

        System.out.println(str.compareTo(new StringBuffer("Rutik")));//return the difference 

        System.out.println(str);
    }
}


// thread safe 
// performance overhead