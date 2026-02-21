

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCode_and_Equals_class
{
    public static void main(String[] args)
    {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Bob", 2);
        Person p3 = new Person("Alice", 1);

        map.put(p1, "Engineer");
        map.put(p2, "Designer");
        map.put(p3, "Manager");

        map.put(p1, "Engineer"); // hashcode1 --> index1
        map.put(p2, "Designer"); // hashcode2 --> index2
        map.put(p3, "Manager"); // hashcode1 --> index1 --> equals --> replace

        System.out.println("HashMap Size: " + map.size());
        System.out.println("Value for p1: " + map.get(p1));
        System.out.println("Value for p3: " + map.get(p3));












        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Shubham", 90); // hashcode1 --> index1
        map1.put("Neha", 92); // hashcode2 --> index2
        map1.put("Shubham", 99); // hashcode1 --> index1 --> equals() --> replace

    }

}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

   /*  What hashCode() is doing  ::

    public int hashCode() {
        return Objects.hash(name, id);
    }

    Computes a hash value based on name and id fields
    Two Person objects with same name and id → same hash
    Used by HashMap/HashSet to choose bucket
    Default behavior (from Object)
    Each object gets an identity-based hash (not based on fields)
    So even if data same → hash usually different

    What equals() is doing

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Person other = (Person) obj;
        return id == other.getId() &&
                Objects.equals(name, other.getName());
    }

Checks logical equality:

Same reference → true

Null → false

Same class → continue
Compare id and name
So two objects are equal if their data matches

Default behavior (from Object)
this == obj
Only same memory reference is equal, not same data */

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name, other.getName());
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }

}
