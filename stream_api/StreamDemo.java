package stream_api;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        
        Stream<Integer> stream = list.stream();
        
        Stream<Integer> s1 = stream.filter(n -> n%2 == 0);
        
        Stream<Integer> s2 = s1.map(n -> n*2 + 1);
        int result = s2.reduce(0, (c, e) -> c+e);

        System.out.println(result); 

        // entire operation in one way
        int r1 = list.stream()
                    .filter(n -> n%2 == 0)
                    .map(n -> n*2 + 1)
                    .reduce(0, (c,e) -> c+e); 

        System.out.println(r1);

    }
}
