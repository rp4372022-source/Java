package stream_api;

import java.util.ArrayList;
import java.util.List;

public class A3_Reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        int s1 = list.stream().reduce(0, (c, e) -> c+e); //0 is start and c + e is basically adding next number with prev addition
        System.out.println(s1);
    }
}
