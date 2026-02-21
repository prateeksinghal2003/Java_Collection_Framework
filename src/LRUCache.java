import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V>
{
    private int capacity;

    public LRUCache(int capacity)
    {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }



    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest)
    {
        return size() > capacity;
    }

    public static void main(String[] args)
    {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
        studentMap.put("Bob", 99);
        studentMap.put("Alice", 89);
        studentMap.put("Ram", 91);
        studentMap.put("Bob", 100);
        studentMap.put("Vipul", 89);


        System.out.println(studentMap);
    }
}


/*Line first
public class LRUCache<K, V> extends LinkedHashMap<K, V>
Meaning

        You are creating a new class named LRUCache

<K,V> → generic types (any key, any value)

extends LinkedHashMap → your cache is a LinkedHashMap, not using it — inheriting it

So your class automatically gets:

put(), get(), remove(), containsKey(), size(), entrySet() ...

You only customize removal policy → that becomes LRU cache.

How whole code works
1️⃣ Constructor
public LRUCache(int capacity)
{
    super(capacity, 0.75f, true);
    this.capacity = capacity;
}

Calling parent constructor:

LinkedHashMap(initialCapacity, loadFactor, accessOrder)

Here:

capacity → initial size

0.75f → resize factor (default)

true → ACCESS ORDER ENABLED

Meaning:

Recently accessed elements move to end

This is required for LRU.

2️⃣ Removal rule (MOST IMPORTANT PART)
@Override
protected boolean removeEldestEntry(Map.Entry<K, V> eldest)
{
    return size() > capacity;
}

This method is automatically called after every put()
If it returns true → oldest entry removed

So logic:
if cache size exceeds limit → remove least recently used
That is the actual LRU implementation.

Main execution
LRUCache<String, Integer> studentMap = new LRUCache<>(3);
Capacity = 3
Insertions
1
Bob 99

Map:

Bob
2
Alice 89

Map:

Bob → Alice
3
Ram 91

Map:

Bob → Alice → Ram
Update existing key
studentMap.put("Bob", 100);

Bob accessed → becomes most recent
Map order:
Alice → Ram → Bob

        (No removal, size still 3)

Add new element
studentMap.put("Vipul", 89);

Now size becomes 4 → exceeds capacity

So removeEldestEntry() runs

Oldest = Alice → removed

Final map:

Ram → Bob → Vipul

System.out.println(studentMap);

Prints:

        {Ram=91, Bob=100, Vipul=89}
Key idea
You didn't manually write LRU logic.
You only:
Enabled access order
Override removal condition
LinkedHashMap handled everything. */
