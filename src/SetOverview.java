import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview
{
    public static void main(String[] args)
    {
        //  Set is a collection that cannot contain duplicate elements
        //it extends Collection
        //Hash set is unordered
        // faster operations
        // Map(I) --> implemented by HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set(I) --> HashSet, LinkedHashSet, TreeSet, EnumSet

        Set<Integer> set2=new HashSet<>();


        //Navigable set is an interface
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67);

        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.remove(67));
        set.clear();

        System.out.println(set.isEmpty());

        for(int i: set){
            System.out.println(i);
        }

        // for thread safety

        Set<Integer> set1 =  new ConcurrentSkipListSet<>();


        ConcurrentSkipListSet<Integer> ckls=new ConcurrentSkipListSet<>();
        //has built in thread safety

        //for unmodifiable
        //of method is from java 9
       // Set<Integer> integers = Set.of(1, 2, 3,4,5,6,7,8,9,54,4323,545,4545);

    }
}