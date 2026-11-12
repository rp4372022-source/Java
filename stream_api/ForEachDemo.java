package stream_api;

import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;

public class ForEachDemo{
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // modern way to print or work with ele in list
        nums.forEach(n -> System.out.println(n)); 

        // forEach take the consumer interface
        Consumer<Integer> con = new Consumer<>() {
            public void accept(Integer n){
                System.out.println(n*2);
            }
        };

        nums.forEach(con);

        // reduced way for con
        Consumer<Integer> con1 = n -> System.out.println(n*3);
        nums.forEach(con1);
        //now the con1 expression is what we already done above 
    }
}