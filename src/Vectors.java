import java.util.Arrays;
import java.util.Vector;

public class Vectors
{

    public static  void main(String[] args)
    {
        //all methods of vector are synchronize
        //in multithreaded environment, multiple threads cannot access the same resource at the same time
        //performance overhead due to locking and unlocking
        //for single threaded use arraylist instead of vectors

        Vector<Integer> vector=new Vector<>();
        System.out.println(vector.capacity());

        //capacity gets double when full by default
        Vector<Integer> vector2=new Vector<>(5,3);
        //second parameter defines by how much new vector capacity is increased

        Vector<Integer> vector3=new Vector<>(Arrays.asList(1,23,45,67));
        //vector.size()
        //isEmpty()
        //clear


    }
}
