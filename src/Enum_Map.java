import java.util.EnumMap;
import java.util.Map;

public class Enum_Map {
    public static void main(String[] args) {
        // enum map--array of size same as enum
        // [_,"Gym",_,_,_,_,_]
        // no hashing
        // ordinal/index is used
        // FASTER THAN HASHMAP
        // MEMORY EFFICIENT
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "Walk");

        //here no hashing is required,due to ordinal index
        //here ordinal is maintained
        //ordinal is index of the internal array in enum
        System.out.println(Day.TUESDAY.ordinal());
        String s = map.get(Day.TUESDAY);
        System.out.println(map);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}