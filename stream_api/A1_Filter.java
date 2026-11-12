package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class A1_Filter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // filter take interface predicate
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer n){
                return n % 2 == 0; //contidion;
            }
        };

        Stream<Integer> s1 = list.stream().filter(p);
        s1.forEach(n -> System.out.println(n));

        // shorter version of predicate 
        Predicate<Integer> p1 = n -> n%2 == 0;
        Stream<Integer> s2 = list.stream().filter(p1);
        s2.forEach(n -> System.out.println(n));
        // most shorter 
        Stream<Integer> s3 = list.stream().filter(n -> n%2 == 0);
        s3.forEach(n -> System.out.println(n));
        
    }
}
