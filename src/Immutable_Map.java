import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Immutable_Map{
    public static void main(String[] args)
    {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

         //returns unmodifiable view of map
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
//        map2.put("C", 3); throws exception




    }
}