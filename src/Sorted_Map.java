import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;


public class Sorted_Map
{
    public static void main(String[] args)
    {
       // SortedMap<String,Integer> tm=new TreeMap<>((a,b)->b.compareTo(a));
        SortedMap<String,Integer> tm=new TreeMap<>();

        tm.put("naman",91);
        tm.put("karan",31);
        tm.put("ajay",12);
        System.out.println(tm);



        System.out.println(tm.firstKey());
        System.out.println(tm.headMap("naman"));//will not include naman ,start from head(sorted tree map)
        System.out.println(tm.tailMap("karan"));


        NavigableMap<Integer,String> nm=new TreeMap<>();
        nm.put(1,"ajay");
        nm.put(2,"karan");
        nm.put(3,"tarun"); //to move up and down ctrl+shift+up key
        //it has some methods
        System.out.println(nm.lowerKey(4)); //strictly less than 4
        System.out.println(nm.ceilingKey(1)); // greater or equal than 1


    }
}
