import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_Map
{

    public static void main(String[] args)
    {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Neha");
        hm.put(2,"Sneha");

        System.out.println(hm);
        //hm.get(3);
        //key is passed
        //hm.remove(1);

        //if key not found returns null
        //hm.containsKey(key_value)
        System.out.println(hm.containsValue("Sneha"));

        Set<Integer> s=hm.keySet();
        //to traverse the map we use hm.keySet()

        Set<Map.Entry<Integer, String>> entries = hm.entrySet();

        for(Map.Entry<Integer, String> entry:entries)
        {
            entry.setValue(entry.getValue().toUpperCase());
           System.out.println(entry.getKey() +" : "+entry.getValue());
        }

//        entrySet() in Map
//        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
//        What it returns
//
//        entrySet() gives a Set view of all key-value pairs stored in the map.
//
//            Type:
//
//        Set of Map.Entry<K,V>
//
//        So instead of getting only keys or only values, you get both together as one object (Entry).
//
//            Each element:
//
//    Entry = (key + value pair)
//        Why used
//
//        To iterate a map efficiently without searching value again using key
//
//        Bad way:
//
//        for(Integer k : hm.keySet())
//            hm.get(k);        // extra lookup
//
//        Better way:
//
//        for(Map.Entry<Integer,String> e : hm.entrySet())
//
//            Direct access → faster
//
//        Your loop explained
//        for(Map.Entry<Integer, String> entry : entries)
//        {
//            entry.setValue(entry.getValue().toUpperCase());
//            System.out.println(entry.getKey() +" : "+entry.getValue());
//        }
//        Step by step
//
//        Each entry object contains:
//
//        entry.getKey()   → key
//        entry.getValue() → value
//        Important line
//        entry.setValue(entry.getValue().toUpperCase());
//
//        This modifies the actual map
//
//        Because entrySet() is not a copy
//        It is a live view of the map
//
//        So change in entry → change in HashMap
//
//        What happens internally
//
//        Map:
//
//        1 → "rahul"
//        2 → "amit"
//
//        Loop:
//
//        entry = (1,"rahul") → becomes (1,"RAHUL")
//        entry = (2,"amit")  → becomes (2,"AMIT")
//
//        Final map updated.
//
//            Key idea
//
//        entrySet() provides direct access to internal key-value nodes of the map.
//
//        One-line definition
//
//       entrySet() returns a set view of map entries allowing direct reading and modification of key-value pairs.

            String name=hm.getOrDefault(11,"no name");
            System.out.println(name);

            hm.putIfAbsent(1,"neha");

        Set<Map.Entry<Integer, String>> entries2 = hm.entrySet();

        for(Map.Entry<Integer, String> entry:entries2)
        {

            System.out.println(entry.getKey() +" : "+entry.getValue());
        }


    }

}



