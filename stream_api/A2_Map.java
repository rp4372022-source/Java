package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class A2_Map {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // map take interface predicate
        Function<Integer, Integer> f = new Function<>() {
            public Integer apply(Integer i){
                return i*2; //condition
            }
        };
        Stream<Integer> s1 = list.stream().map(f);
        s1.forEach(n -> System.out.println(n));

        // shorter version 
        Function<Integer,Integer> f1 = n -> n*2;
        Stream<Integer> s2 = list.stream().map(f1);
        s2.forEach(n -> System.out.println(n));

        // shortest version
        Stream<Integer> s3 = list.stream().map(n -> n*2);
        s3.forEach(n -> System.out.println(n));
        
    }
}
