import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHash_Map
{
    public static  void main(String[] args)
    {
          LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(11,0.3f,true);
          //accessOrder true hone se LRU mechanism lag jayega
          //so keys which are used more recently are placed at bottom

        lhm.put(1,"Anil");
        lhm.put(2,"Sunil");
        lhm.put(3,"Karan");

        lhm.get(3);
        lhm.get(2);

        // do not use for loop when accessOrder is true
       // get() itself changes order in accessOrder mode
       // So during printing, you keep modifying the map order again.
      //  You are unintentionally updating LRU order while reading.

        for(Map.Entry<Integer,String> e : lhm.entrySet())
        {
            System.out.println(e.getKey()+":"+e.getValue());
        }

    }
}
