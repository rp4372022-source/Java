package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Navin","Laxmi","John","Kishor"));

        String name = names.stream()
                        .filter(n -> n.contains("a"))
                        .toString();
        System.out.println(name);
        // the problem is if no name is there with a 
        // it will return null pointer exception

        // to avoid these we use null pointer exception

        Optional<String> name1 = names.stream()
                                    .filter(n -> n.contains("a"))
                                    .findFirst();
        System.out.println(name1.orElse("Name not found"));

        // another way is
        String name2 = names.stream()
            .filter(n -> n.contains("x"))
            .findFirst()
            .orElse("Name not found");
        System.out.println(name2);
    }
}
