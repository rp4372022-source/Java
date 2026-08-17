package collections_practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {
        /*The List interface in Java is an ordered sequence 
        (a linear collection) that permits precise positional 
        access and insertion of elements, while allowing 
        duplicate entries and null values.*/

        //arrays list
        List<Integer> nums = new ArrayList<>();
        nums.add(1); //o(1)
        nums.add(0,1); // o(n)
        nums.remove(0); //o(n)
        nums.contains(1);//o(1)
        nums.get(0);//o(1)

        //Linked list
        List<Integer> nodes = new LinkedList<>();
        nodes.add(0,1); //o(1)
        nodes.get(0);//o(n)
        nodes.remove(0); //o(n)
        
        /*set
        The Set interface in Java represents a collection 
        that contains no duplicate elements (where e1.equals(e2) 
        evaluates to true) and at most one null element. 
        It models the mathematical set abstraction.*/

        //hashset -> no sequence
        Set<String> fruits = new HashSet<>();
        fruits.add("banana");
        fruits.add("apple");
        
        //Linkedset ->store in sequence
        Set<String> flowers = new LinkedHashSet<>();
        flowers.add("rose");
        flowers.add("sunflower");
        
        //Tree set -> Natural Ordering (Alphabetical/Numerical)
        Set<Integer> rollNo = new TreeSet<>();
        rollNo.add(1);
        rollNo.add(2);
        rollNo.add(1); // no store
        rollNo.add(1); // willl not store
        rollNo.add(1); // will not store

        for(int a:rollNo){
            System.out.println(a);
        }

        /*A Map maps unique keys to values. It does not extend
        Collection, but it is fully integrated into the framework.*/

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Primary weapon");
        hashMap.put(2,"Secodary weapon");


        // 1. FIFO Standard Queue using LinkedList
        Queue<String> fifoQueue = new LinkedList<>();
        fifoQueue.offer("Task1"); // Enqueue
        fifoQueue.offer("Task2");
        String nextTask = fifoQueue.poll(); // Dequeue -> returns "Task1"


         // 2. PriorityQueue: Sorted by element priority, O(log N)
        Queue<Integer> pq = new PriorityQueue<>(); 
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        int highestPriority = pq.poll(); // returns 10 (lowest number first by default


        // ArrayDeque: Faster than Stack/LinkedList, chunk-backed array
        Deque<String> deque = new ArrayDeque<>();

        // Using it as a Stack (LIFO)
        deque.push("Bottom");
        deque.push("Top");
        String popped = deque.pop(); // returns "Top"

        // Using it as a Double-Ended Queue
        deque.addFirst("NewHead");
        deque.addLast("NewTail");
        String head = deque.removeFirst();
        String tail = deque.removeLast();
    }
}
