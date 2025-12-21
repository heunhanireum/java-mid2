package collection.map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5,  "D", 6);

        Set<String> commonSet = new HashSet<>(map1.keySet());
        commonSet.retainAll(map2.keySet());

        Map<String, Integer> result = new HashMap<>();
        for (String key : commonSet) {
            result.put(key, map1.get(key) + map2.get(key));
        }
        System.out.println(result);
    }
}
