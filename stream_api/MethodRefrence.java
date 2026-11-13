package stream_api;

import java.util.ArrayList;
import java.util.List;

public class MethodRefrence {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(
            List.of("Rutik","Apurv","Tanmay","Manas","Jidnesh")
        );

        // normal way
        List<String> uNameList = names.stream()
            .map(n -> n.toUpperCase())
            .toList();
        System.out.println(uNameList);
        // by method refrence
        List<String> uNameList2 = names.stream()
            .map(String::toUpperCase) //mention the class name and the method name without brackets
            .toList();

        uNameList2.forEach(System.out::println);
    }
}
