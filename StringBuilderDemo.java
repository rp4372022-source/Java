public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Apurv");
        stringBuilder.append(" Mokal");

        System.out.println(stringBuilder);
    }
}

// not thread safe or synchronised 
// efficient for single threaded options

