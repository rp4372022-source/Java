package stream_api;

import java.util.ArrayList;
import java.util.Random;

public class A5_ParallelStream {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10_000);

        Random r = new Random();
        for(int i=0;i<10_00_00_000;i++){list.add(i, r.nextInt(101));}

        // System.out.println(list);

        // to check the speed we use comparision btn stream and paraller stream using time start and end 

        long start = System.currentTimeMillis();
        int res1 = list.stream().mapToInt(i -> i).sum();
        long end = System.currentTimeMillis();
        System.out.printf("Sequential Stream : res = %d, time = %d \n",res1,(end-start));


        long start1 = System.currentTimeMillis();
        int res2 = list.parallelStream().mapToInt(i -> i).sum();
        long end1 = System.currentTimeMillis();
        System.out.printf("Parallel Stream   : res = %d, time = %d\n",res2,(end1-start1));
        

        // at certain range sequential works faster
        // at lower range paraller works faster
    }
}
