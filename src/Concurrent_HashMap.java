import java.util.concurrent.ConcurrentHashMap;

public class Concurrent_HashMap
{
    public static void main(String[] args) {
        ConcurrentHashMap<String ,Integer_Comparing>chm=new ConcurrentHashMap<>();
          //in java 7 , entire map is divided into 16 segments(small hashmaps)
        //each segment have its own lock
        //read --no locking is required
        //write--lock is required

        //java 8
        //no segmentation
        //use compare and swap approach
        //no locking except resizing and collision

        //size if full not get doubled , it is increased by 1

    }
}
