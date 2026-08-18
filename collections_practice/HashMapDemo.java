package collections_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>(32);

        // 1. CREATE / UPDATE (Insertion)
        inventory.put("MacBook", 10);
        inventory.put("iPhone", 25);
        inventory.put("MacBook", 12); // Overwrites prev value (10 -> 12)

        // 2. READ (Retrieval)
        int macCount = inventory.get("MacBook"); // Returns 12
        // Safe Read: Returns default value if key doesn't exist (Prevents NullPointerException)
        int ipadCount = inventory.getOrDefault("iPad", 0); // Returns 0

        // 3. DELETE (Removal)
        inventory.remove("iPhone"); // Removes key and its value
        // Conditional Delete (Removes only if key is mapped to specific value)
        boolean removed = inventory.remove("MacBook", 5); // Returns false, value is 12

        // 4. PRESENCE CHECKS
        boolean hasIphone = inventory.containsKey("iPhone"); // O(1) time
        boolean hasTenItems = inventory.containsValue(10);   // O(N) time - Requires full table scan


        // Advanced Java 8+ Compute Operations
        Map<String, List<String>> heavyMap = new HashMap<>();
        // 1. computeIfAbsent: Computes a value ONLY if the key is missing. 
        // Ideal for building multi-maps (Map of Collections)
        heavyMap.computeIfAbsent("Engineers", key -> new ArrayList<>()).add("Alice");
        heavyMap.computeIfAbsent("Engineers", key -> new ArrayList<>()).add("Bob");

        // 2. computeIfPresent: Mutates an existing value. If function returns null, key is deleted.
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Player1", 100);
        scores.computeIfPresent("Player1", (key, oldVal) -> oldVal + 50); // Increments to 150

        // 3. merge: Perfect for aggregations. Combines old and new values.
        Map<String, Integer> wordCounts = new HashMap<>();
        wordCounts.put("Java", 1);
        // Syntax: merge(Key, NewValue, (OldValue, NewValue) -> NewValue)
        wordCounts.merge("Java", 1, Integer::sum); // Increments "Java" count to 2
        wordCounts.merge("Python", 1, Integer::sum); // Inserts "Python" with value 1


        // Iteration Strategies
        Map<String, String> config = new HashMap<>();
        config.put("timeout", "30");
        config.put("retries", "3");

        //EntrySet Loop (Most efficient when you need BOTH keys and values)
        for (Map.Entry<String, String> entry : config.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        //Lambda ForEach (Cleanest syntax, uses Consumer)
        config.forEach((key, value) -> System.out.println(key + ":" + value));

        //KeySet / Values loops (Use when you only need one or the other)
        for (String key : config.keySet()) { /* O(1) lookups inside */ }
        for (String value : config.values()) { /* Stream or process values */ }
    }
}
